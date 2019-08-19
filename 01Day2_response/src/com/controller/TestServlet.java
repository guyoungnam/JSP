package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/aaa","/bbb"}) //2�� ��������
public class TestServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
     
		//html �����۾� --> ����ó��
		
		//1.���������� ó���� ������ ����(Ÿ��) ����: MIMEŸ��
		response.setContentType("text/html;charset=utf-8");
		
		//2. �ڹ� I/O�� ��� (output)
		//ServletOutputStream sos=response.getOutputStream();
		PrintWriter out= response.getWriter();
		out.print("<html><body>");
		out.print("hello,�ȳ��ϼ���");
		out.print("</body></html>");

		
	}//end doGet

}//end class
