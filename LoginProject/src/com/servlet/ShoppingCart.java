package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/shoppingCart")
public class ShoppingCart extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		//String userName=session.getAttribute("uname").toString();
		String histbooks[]=request.getParameterValues("book");
		
		
		ArrayList<String> list1=(ArrayList<String>)session.getAttribute("book");
		for(String item:histbooks){
			list1.add(item);
		}
		PrintWriter out=response.getWriter();
		session.setAttribute("book", list1);
		for(String s:list1){
			out.write(s+"\n");
		}
		out.print("<html>"
				+ "<head></head>"
				+ "<body>"
				+ "<form action=\"controller?forward=logout\" method=\"post\">"
				+ "<input type=\"submit\" value=\"Logout\"><br>"
				+ "</form></body>"
				+ "</html>"
				);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
