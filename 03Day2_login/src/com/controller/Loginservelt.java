
package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Loginservelt")
public class Loginservelt extends HttpServlet {
		


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		request.setCharacterEncoding("utf-8");
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
	
		//db �̿��ؼ� ����� Ȯ��
		//����
	
		HttpSession session = request.getSession();
		
		session.setMaxInactiveInterval(60*60*24); //1��
		session.setAttribute("userid", userid);
		session.setAttribute("kkk", "ȫ�浿");

		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print(userid+"�� ȯ���մϴ�.");
		out.print("<a href='LoginInfoServlet'>LoginInfoServlet</a>");
		out.print("</body></html>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
