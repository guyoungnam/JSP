package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/aaa","/bbb"}) //2개 생성가능
public class TestServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
     
		//html 생성작업 --> 응답처리
		
		//1.브라우저에게 처리할 데이터 종류(타입) 지정: MIME타입
		response.setContentType("text/html;charset=utf-8");
		
		//2. 자바 I/O의 출력 (output)
		//ServletOutputStream sos=response.getOutputStream();
		PrintWriter out= response.getWriter();
		out.print("<html><body>");
		out.print("hello,안녕하세요");
		out.print("</body></html>");

		
	}//end doGet

}//end class
