package com.this0.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/fruit")
public class FruitServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String fname = req.getParameter("fname");
        Integer price = Integer.valueOf(req.getParameter("price"));
        Integer fcount = Integer.valueOf(req.getParameter("fcount"));
        String remark = req.getParameter("remark");

        System.out.println("fname=" + fname);
        System.out.println("price=" + price);
        System.out.println("fcount=" + fcount);
        System.out.println("remark=" + remark);
    }
}
