package com.this0.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "TestForward", value = "/testForward")
public class TestForward extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("内部转发......");
        System.out.println("转发到servletLifeCycle......");

        req.getRequestDispatcher("/servletLifeCycle").forward(req, resp);
    }
}
