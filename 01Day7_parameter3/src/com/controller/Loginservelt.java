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
		
		
		//post�ѱ�ó�� ��->����
		request.setCharacterEncoding("utf-8");
		
		
		//�Ķ������ Ű(name)�� ��� , Ű�� �˾Ƶ� ���� �𸦶��� ����
		// �Ķ���Ͱ� �������
		
		Enumeration<String> keys =request.getParameterNames();
		
		//����ó�� ����->��
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			
		
		//Iterator�� ���� ����, Enumeration -> �ݺ��Ҷ� ���
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
