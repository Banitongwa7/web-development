package com.example.tp1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UppercaseServlet", value = "/uppercase-servlet")
public class UppercaseServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String value = (String) request.getParameter("chaine");
        if (value != null) {
            value = value.toUpperCase();
        } else {
            value = "";
        }
        response.getWriter().println("Votre chaine est : " + value);
    }
}
