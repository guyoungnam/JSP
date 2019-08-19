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
                   
		//1. 쿠키 생성
		 Cookie c= new Cookie("username", "홍길동");
		 
		 //2. 작업하고 응다베 쿠키 추가
         
		 c.setMaxAge(60*60*24);
		 response.addCookie(c);
		 
		 //3. 응답처리
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print("<html><body>");
			out.print("쿠키저장성공 : 홍길동");
			out.print("</body></html>");
			
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
