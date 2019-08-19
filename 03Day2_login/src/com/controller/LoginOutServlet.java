package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginOutServlet")
public class LoginOutServlet extends HttpServlet {
		


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session =request.getSession();
		String userid = (String)session.getAttribute("userid");
		System.out.println(session.getAttribute("kkk"));
				
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		
		if(userid==null) {
			
			out.print("로그인이 필요한 작업입니다.");
			out.print("<a href='loginform.html'>로그인화면</a>");
			
		}else {
			
			session.invalidate();
			out.print("로그아웃 성공");
			out.print("<a href='loginform.html'>로그인화면</a>");
			
		}
			
		out.print("</body></html>");
	}// end doGet
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
