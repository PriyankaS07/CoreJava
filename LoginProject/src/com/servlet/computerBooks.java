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

@WebServlet("/computerBooks")
public class computerBooks extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String userName=session.getAttribute("uname").toString();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd =null;
		out.print("<html>"
				+ "<head></head>"
				+ "<body><h1>Welcome "+userName+"</h1>"
				+ "<form action=\"controller?forward=historyBooks\" method=\"post\">"
				+ "<input type=\"checkbox\" name= \"book\" value=\"C\">C<br>"
				+ "<input type=\"checkbox\" name=\"book\" value=\"C++\">C++<br>"
				+ "<input type=\"checkbox\" name=\"book\"  value=\"Java\">Java<br>"
				+ "<input type=\"submit\" name=\"next\" value=\"next\"><br>"
				+ "</form></body>"
				+ "</html>"
				);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
