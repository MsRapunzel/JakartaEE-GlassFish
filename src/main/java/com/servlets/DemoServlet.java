/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.servlets;

import jakarta.servlet.ServletConfig;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author msrapunzel
 */
@WebServlet(name = "DemoServlet", urlPatterns = {"/DemoServlet"})
public class DemoServlet extends HttpServlet {

    private ServletConfig config = null;

    @Override
    public void init(ServletConfig config) {
        this.config = config;
        String servletName = config.getServletName();
        System.out.println("< - - - - MESSAGE: " + servletName + " was initialized - - - - >");
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        String servletName = config.getServletName();
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        try {
            request.getRequestDispatcher("index.html").include(request, response);
            String action = request.getParameter("action");
            out.println("<p>Hello, " + servletName + "!</p>");
            if ("random".equals(action)) {
                out.println("<p>Random number: " + getRandomNumber() + "</p>");
            } else if ("time".equals(action)) {
                out.println("<p>Current Date and Time: " + getCurrentDateTime() + "</p>");
            }
        } finally {
            out.close();
        }
    }

    private String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }

    private double getRandomNumber() {
        return Math.random();
    }

}

