package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/controller") 
public class Controller extends HttpServlet {
	private ServletContext ctx;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.ctx=config.getServletContext();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param=request.getParameter("forward");
		RequestDispatcher rd=null;
		if(param.equals("Login")){
			rd=request.getRequestDispatcher("/Login");  
	        rd.forward(request, response);  	
		}
		else if(param.equals("computerBooks")){
			rd=request.getRequestDispatcher("/computerBooks");  
	        rd.forward(request, response);  	
		}
		else if(param.equals("historyBooks")){
			rd=request.getRequestDispatcher("/historyBooks");  
	        rd.forward(request, response);  	
		}
		else if(param.equals("shoppingCart")){
			rd=request.getRequestDispatcher("/shoppingCart");  
	        rd.forward(request, response);  	
		}
		else if(param.equals("logout")){
			request.getSession().invalidate();
			rd=request.getRequestDispatcher("/login.html");  
	        rd.forward(request, response);  	
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
