package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/TestController")
public class TestController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

          System.out.print("TestController.doGet");
          
          //hello.jsp 선택 (요청)
          
          request.setAttribute("request", "홍길동");
          
          HttpSession session = request.getSession();
          session.setAttribute("session", "이순신");
          
          //1.redirect 방법
          // url 이 바뀐다. 이유는 
          
         // response.sendRedirect("Hello.jsp");
          
          RequestDispatcher dis =
          request.getRequestDispatcher("Hello.jsp");
          dis.forward(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
