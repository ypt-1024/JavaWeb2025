package com.this0.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class loginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //获取session对象
        HttpSession session = req.getSession();

        //获取Session的ID
        String jSessionId = session.getId();
        System.out.println(jSessionId);

        //判断session是不是新创建的session
        boolean isNew = session.isNew();
        System.out.println(isNew);

        if (username != null && password != null && username.equals("admin") && password.equals("admin")) {
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            System.out.println("登录成功，数据存到了session中");
        }
    }
}
