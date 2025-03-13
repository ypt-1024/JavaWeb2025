package com.this0.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/getSession")
public class getSession extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        //获取jSessionId
        String jSessionId = session.getId();
        System.out.println(jSessionId);

        //是不是新session
        boolean isNew = session.isNew();
        System.out.println(isNew);

        //从session中取出数据
        Object username = session.getAttribute("username");
        Object password = session.getAttribute("password");

        System.out.println(username);
        System.out.println(password);
    }
}
