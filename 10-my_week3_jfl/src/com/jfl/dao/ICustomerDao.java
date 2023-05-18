package com.jfl.dao;

import com.jfl.bean.Customer;

import java.util.List;

public interface ICustomerDao {
    List<Customer> showList(String nick_name,String name, String startDate, String endDate) throws Exception;

    // 转正 根据id查单条数据
    Customer getOne(int id) throws Exception;

    int update(int id) throws Exception;

    int add(Customer customer) throws Exception;

}
