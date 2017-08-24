package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/historyBooks")
public class HistoryBooks extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String userName=session.getAttribute("uname").toString();
		String compbooks[]=request.getParameterValues("book");
		ArrayList<String> list=new ArrayList<String>(Arrays.asList(compbooks));
		PrintWriter out=response.getWriter();
		out.print("<html>"
				+ "<head></head>"
				+ "<body>"
				+ "<form action=\"controller?forward=shoppingCart\" method=\"post\">"
				+ "<input type=\"checkbox\" name= \"book\" value=\"Indian History\">Indian History<br>"
				+ "<input type=\"checkbox\" name=\"book\" value=\"World History\">World History<br>"
				+ "<input type=\"checkbox\" name=\"book\" value=\"Maharashtra History\">Maharashtra History<br>"
				+ "<input type=\"submit\" value=\"Show\"><br>"
				+ "</form></body>"
				+ "</html>"
				);
		session.setAttribute("book", list);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
