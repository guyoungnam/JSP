package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
		
		
		//요청작업 ==> 파라미터 얻기
		
		String userid=request.getParameter("userid");
		String passwd=request.getParameter("passwd");
		
		System.out.println(userid+"\t"+passwd);
		
		//응답처리 서버->웹
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("이름은:" +userid+"<br>");
		out.print("나이는"+passwd);
		out.print("</body></html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
