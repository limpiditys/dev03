package com.jfl.servlet;

import com.jfl.bean.Customer;
import com.jfl.dao.ICustomerDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf8");
        resp.setCharacterEncoding("utf8");
        resp.setContentType("text/html;charset=utf-8");

        String name = req.getParameter("name");
        String nick_name = req.getParameter("nick_name");
        String startDate = req.getParameter("startDate");
        String endDate = req.getParameter("endDate");

        ICustomerDaoImpl dao = new ICustomerDaoImpl();

        try {
            List<Customer> list = dao.showList(nick_name,name,startDate,endDate);

            req.setAttribute("arr",list);

            // 放请求域回显
            req.setAttribute("nick_name",nick_name);
            req.setAttribute("name",name);
            req.setAttribute("startDate",startDate);
            req.setAttribute("endDate",endDate);

            req.getRequestDispatcher("list.jsp").forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}