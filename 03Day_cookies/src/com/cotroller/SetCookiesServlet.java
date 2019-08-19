package com.cotroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SetCookiesServlet")
public class SetCookiesServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                   
		//1. ��Ű ����
		 Cookie c= new Cookie("username", "ȫ�浿");
		 
		 //2. �۾��ϰ� ���ٺ� ��Ű �߰�
         
		 c.setMaxAge(60*60*24);
		 response.addCookie(c);
		 
		 //3. ����ó��
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print("<html><body>");
			out.print("��Ű���强�� : ȫ�浿");
			out.print("</body></html>");
			
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
