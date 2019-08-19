package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/GetServlet")
public class GetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 1. 세션 얻기
		HttpSession session = request.getSession();
		
		// 2. 값 얻기
		String str = (String)session.getAttribute("username");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");


		
		if(str==null) {
			out.print("비정상 요청입니다.");
			out.print("<a href='SetServlet'>SetServlet</a>");
		}else {
			out.print(str);
		}
		
		out.print("</body></html>");
	}

}
