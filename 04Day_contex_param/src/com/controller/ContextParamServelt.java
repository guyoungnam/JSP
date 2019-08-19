package com.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ContextParamServelt extends HttpServlet {



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               System.out.println("ContextParamServelt.doGet");
               
               //context 파라미터 얻기
               ServletContext ctx = getServletContext();
               String userid = ctx.getInitParameter("userid");
               String email = ctx.getInitParameter("email");
               
               System.out.println(userid+"\t"+email);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
