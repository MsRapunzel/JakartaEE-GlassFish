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

/**
 *
 * @author msrapunzel
 */
@WebServlet(name = "HandyServlet", urlPatterns = {"/HandyServlet"})
public class HandyServlet extends HttpServlet {

    ServletConfig config = null;

    @Override
    public void init(ServletConfig config) {
        this.config = config;
        String servletName = config.getServletName();
        System.out.println("< - - - - MESSAGE: " + servletName + " was initialized - - - - >");
    }

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

                String servletName = config.getServletName();
        res.setContentType("text/html");

        PrintWriter out = res.getWriter();
        try {
            out.println("<html><body>");
            out.println("<p>Hello, " + servletName + "!</p>");
            out.println("<p>Servlet Info: " + getServletInfo() + "</p");
            out.println("<p>Servlet Config: " + getServletConfig() + "</p>");
            out.println("<a href=\"/JakartaEEApp\">Go to Homepage</a>");
            out.println("</body></html>");
        } finally {
            out.close();
        }
    }

    @Override
    public void destroy() {
        String servletName = config.getServletName();
        System.out.println("< - - - - MESSAGE: " + servletName + " was initialized destroyed");
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public String getServletInfo() {
        return "copyright 2024";
    }
}
