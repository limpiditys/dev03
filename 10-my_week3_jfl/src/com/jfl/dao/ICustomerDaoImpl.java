package com.jfl.dao;

import com.jfl.bean.Customer;
import com.jfl.util.BaseDao;

import javax.servlet.http.Cookie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ICustomerDaoImpl implements ICustomerDao{
    @Override
    public List<Customer> showList(String nick_name,String name, String startDate, String endDate) throws Exception {
        Connection con = BaseDao.getCon();

        String sql = "select * from customer where 1=1 ";

        // ‘%"+a+"%’
        if (nick_name != null && nick_name != "") {
            sql += " and nick_name like '%"+nick_name+"%' ";
        }

        // ‘“+a+”’
        if (name != null && name != "") {
            sql += "and name = '"+name+"'";
        }

        if (startDate != null &&startDate != "" && endDate != null && endDate != "") {
            sql += "and hiredate between '"+startDate+"' and '"+endDate+"'";
        }

        System.out.println(sql);

        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet res = ps.executeQuery();

        ArrayList<Customer> list = new ArrayList<>();

        while (res.next()) {
            Customer customer = new Customer(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getInt(8));

            list.add(customer);
        }

        return list;
    }

    @Override
    public Customer getOne(int id) throws Exception {
        Connection con = BaseDao.getCon();

        PreparedStatement ps = con.prepareStatement("select * from customer where id=?");

        ps.setInt(1,id);

        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            Customer customer = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));

            return customer;
        }
        return null;
    }

    @Override
    public int update(int id) throws Exception {
        Connection con = BaseDao.getCon();

        PreparedStatement pre = con.prepareStatement("update customer set status = 1 where id = ?");

        pre.setInt(1,id);

        int i = pre.executeUpdate();


        return i;
    }

    @Override
    public int add(Customer customer) throws Exception {
        Connection con = BaseDao.getCon();

        PreparedStatement pre = con.prepareStatement("insert into customer values (0,?,?,?,?,?,?,0)");

        pre.setString(1,customer.getEmail());
        pre.setString(2,customer.getNick_name());
        pre.setString(3,customer.getName());
        pre.setString(4,customer.getRole());
        pre.setString(5,customer.getTel());
        pre.setString(6,customer.getHiredate());

        int i = pre.executeUpdate();

        return i;
    }
}