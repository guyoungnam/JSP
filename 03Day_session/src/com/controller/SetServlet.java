package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SetServlet")
public class SetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 1. 세션 얻기
		HttpSession session = request.getSession();
		
		// 2. 공유 데이터 저장
		session.setAttribute("username", "홍길동");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("홍길동 저장 성공");
		out.print("<a href='LoginInfoServlet'>LoginInfoServlet</a>");
		out.print("</body></html>");
		
		
		
	}

}
