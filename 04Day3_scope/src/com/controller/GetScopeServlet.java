package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/GetScopeServlet")
public class GetScopeServlet extends HttpServlet {



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    //request scope 에 저장

	    
	    //session scope 에 저장
	    HttpSession session = request.getSession();

	    
	    //application scope에 저장
	    ServletContext ctx = getServletContext();
	    ctx.setAttribute("contex", "유관순");
	    
	    String x= (String)request.getAttribute("request");
	    String x1= (String)session.getAttribute("session");
	    String x2= (String)ctx.getAttribute("ctx");
	    
	    System.out.println("reqest:" +x);
	    System.out.println("session:" +x1);
	    System.out.println("contex:" +x2);
	    
	    //
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
