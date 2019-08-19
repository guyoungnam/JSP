package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Loginservelt")
public class Loginservelt extends HttpServlet {
		


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		
		
		//post한글처리 웹->서버
		request.setCharacterEncoding("utf-8");
		
		
		//파라미터의 키(name)만 얻기 , 키를 알아도 쓰고 모를때도 쓸때
		// 파라미터가 많은경우
		
		Enumeration<String> keys =request.getParameterNames();
		
		//응답처리 서버->웹
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			
		
		//Iterator와 같은 느낌, Enumeration -> 반복할때 사용
		// hasmoreElement, nextElement
		

		
        String value = request.getParameter(key);
		out.print(key+"="+value + "<br>");
		}
		out.print("</body></html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
