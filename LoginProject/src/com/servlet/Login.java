package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("uname");
		String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd = null;
		if(userName.equals("123")&& password.equals("1234")){
			HttpSession session=request.getSession();
			session.setAttribute("uname", userName);
			rd=request.getRequestDispatcher("controller?forward=computerBooks"); 
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
