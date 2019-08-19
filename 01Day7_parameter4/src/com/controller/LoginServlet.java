package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		
		//post한글처리
		request.setCharacterEncoding("utf-8");
		
		// Map형태로 파라미터얻기
		Map<String, String[]> map= request.getParameterMap();

		//응답처리
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out =response.getWriter();
		out.print("<html><body>");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			String [] values = map.get(key);
			String mesg =null;
			for (String v : values) {
				mesg +=v;	
			}
			out.print(key+"="+mesg +"<br>");	
		}

		out.print("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doGet(request, response);
	}

}
