package com.edutecno.servlets.sesiones;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletLeeSesion
 */
@WebServlet("/leeSesion")
public class ServletLeeSesion extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		String nacionalidad = (String) sesion.getAttribute("nacionalidad");
		
		PrintWriter pr = response.getWriter();
		pr.println("Nacionalidad sesión: " + nacionalidad);
	}
}
