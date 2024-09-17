/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 * https://www.educba.com/session-in-servlet/
 */
package com.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.Date;

/**
 *
 * @author msrapunzel
 */
@WebServlet(name = "Sessions", urlPatterns = {"/Sessions"})
public class Sessions extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        PrintWriter out = response.getWriter();
        Date startDate = new Date(session.getCreationTime());
        Date lastDate = new Date(session.getLastAccessedTime());
        String s = "Welcome back to my domain";
        Integer i = new Integer(0);
        String v = "lasytvisittimes";
        String u = "id";
        String u1 = "welcome";

        if (session.isNew()) {
            s = "Welcome to my domain";
            session.setAttribute(u, u1);
            session.setAttribute(v, i);
        }

        i = (Integer) session.getAttribute(v);
        v = v + 1;
        u1 = (String) session.getAttribute(u);
        session.setAttribute(v, i);

        response.setContentType("text/html;charset=UTF-8");
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>" + s + "</title></head>");
            out.println("<body bgcolor = \"#a2ead5\">");
            out.println("<h1 align = \"center\">" + s + "</h1>");
            out.println("<h2 align = \"center\">Session Information</h2>");

            out.println("Session ID: " + session.getId() + "<br>");
            out.println("\n"
                    + ": " + startDate + "<br>");
            out.println("Last Accessed Time: " + lastDate + "<br>");
            out.println("User ID: " + u1 + "<br>");
            out.println("Number of Users: " + i + "<br>");

            out.println("<a href=\"/JakartaEEApp\">Go to Homepage</a>");
            out.println("</body></html>");
        } finally {
            out.close();
        }
    }
}
