package com.jfl.servlet;

import com.jfl.bean.Customer;
import com.jfl.dao.ICustomerDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置编码集
        req.setCharacterEncoding("utf8");
        resp.setCharacterEncoding("utf8");
        resp.setContentType("text/html;charset=utf-8");

        String email = req.getParameter("email");
        String nick_name = req.getParameter("nick_name");
        String name = req.getParameter("name");
        String role = req.getParameter("role");
        String tel = req.getParameter("tel");
        String hiredate = req.getParameter("hiredate");

        ICustomerDaoImpl dao = new ICustomerDaoImpl();

        try {
            int i = dao.add(new Customer(0, email, nick_name, name, role, tel, hiredate, 0));

            if (i > 0) {
               resp.sendRedirect("/ListServlet");
            } else {
                resp.sendRedirect("fail.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}

