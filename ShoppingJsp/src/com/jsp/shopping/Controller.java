package com.jsp.shopping;
import com.jsp.shopping.LoginBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/controller") 
public class Controller extends HttpServlet {
	private ServletContext ctx;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.ctx=config.getServletContext();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=null;
		String param=request.getParameter("forward");
		RequestDispatcher rd=null;
		if(param.equals("authenticate")){
			session=request.getSession(true);
			String uname=request.getParameter("uname");
			session.setAttribute("uname",uname);
		LoginBean loginBean = new LoginBean(request.getParameter("uname"),request.getParameter("pwd"));
		boolean res = loginBean.login();
		if(res){
			rd=request.getRequestDispatcher("/welcome.jsp");  
	        rd.forward(request, response);  	
			}
		}
		
		if(param.equals("history")){
			BookBean bookBean=new BookBean();
			if (session.getAttribute("book")!=null) {
				bookBean.setBooks((ArrayList<String>)session.getAttribute("book"));
				//bookBean.addBook(book);
			}
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}

