package com.jfl.servlet;

import com.jfl.bean.Customer;
import com.jfl.dao.ICustomerDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getOne")
public class getOneServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置编码集
        req.setCharacterEncoding("utf8");
        resp.setCharacterEncoding("utf8");
        resp.setContentType("text/html;charset=utf-8");

        String id = req.getParameter("id");

        ICustomerDaoImpl dao = new ICustomerDaoImpl();

        try {
            Customer one = dao.getOne(Integer.valueOf(id));

            req.setAttribute("One",one);

            req.getRequestDispatcher("update.jsp").forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}

