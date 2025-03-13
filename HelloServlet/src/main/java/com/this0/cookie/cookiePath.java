package com.this0.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/cookiePath")
public class cookiePath extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // cookie1设置提交路径
        Cookie cookie1 = new Cookie("c1", "c1_message");
        cookie1.setPath("/path/cookiePath");

        //cookie2不设置路径
        Cookie cookie2 = new Cookie("c2", "c2_message");

        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
    }
}
