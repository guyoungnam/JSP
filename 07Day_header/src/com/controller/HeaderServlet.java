package com.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HeaderServlet")
public class HeaderServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//header 정보를 이용하면 여러가지 정보 알수 있다. user-agent 
		System.out.println(request.getHeader("user-agent"));
		Enumeration<String> enu = request.getHeaderNames();
		while(enu.hasMoreElements()) {
			String key = enu.nextElement();
			String value = request.getHeader(key);
			System.out.println(key);
			
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
