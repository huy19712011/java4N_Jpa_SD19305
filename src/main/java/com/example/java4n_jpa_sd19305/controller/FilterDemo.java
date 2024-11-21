package com.example.java4n_jpa_sd19305.controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "FilterDemo", urlPatterns = "/filterInput")
public class FilterDemo implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        HttpServletRequest req = (HttpServletRequest) request;
        String username = req.getParameter("name");
        String password = req.getParameter("password");

        // username == user; password = 123
        if (username.equals("user") & password.equals("123")) {

            chain.doFilter(request, response);
        } else {
            out.println("Invalid username or password!");
        }

    }
}
