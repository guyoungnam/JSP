package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginInfoServlet")
public class LoginInfoServlet extends HttpServlet {
		


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session =request.getSession();
		String userid = (String)session.getAttribute("userid");
	
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		if(userid==null) {
			
			out.print("�α����� �ʿ��� �۾��Դϴ�.");
			out.print("<a href='loginform.html'>�α���ȭ��</a>");
		}else {
			
			out.print(userid+"�� ȯ���մϴ�.");
			session.removeAttribute("kkk");
			
			
			out.print("<a href='LoginOutServlet'>�α׾ƿ�</a>");
		}
			
		out.print("</body></html>");
	}// end doGet
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
