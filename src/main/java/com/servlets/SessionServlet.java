/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 * https://www.educba.com/session-in-servlet/
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
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author msrapunzel
 */
@WebServlet(name = "SessionServlet", urlPatterns = {"/session"})
public class SessionServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    ServletConfig config = null;

    public SessionServlet() {
        super();
    }

    @Override
    public void init(ServletConfig config) {
        this.config = config;
        String servletName = config.getServletName();
        System.out.println("< - - - - MESSAGE: " + servletName + " was initialized - - - - >");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            request.getRequestDispatcher("index.html").include(request, response);
            String name = request.getParameter("name");
            String city = request.getParameter("city");
            if (name.equals("")) {
                name = "stranger";
            }
            if (city.equals("")) {
                city = "the unknown";
            }
            out.print("Welcome, " + name + " from " + city);
            HttpSession session = request.getSession();
            session.setAttribute("name", name);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
