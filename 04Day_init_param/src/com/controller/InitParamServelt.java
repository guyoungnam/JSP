package com.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class InitParamServelt extends HttpServlet {



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
               System.out.println("InitParamServelt.doGet");
               
               //초기화 파라미터 얻기1
               String userid = getInitParameter("userid");
               String email = getInitParameter("email");
               
               System.out.println(userid +"\t"+ email);
               
               
               //초기화 파라미터 얻기 2
               Enumeration<String> enu = getInitParameterNames();
               while (enu.hasMoreElements()) {
				String key = (String) enu.nextElement();
				String value = getInitParameter(key);
				System.out.println(">>"+key+"\t"+value);
			}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
