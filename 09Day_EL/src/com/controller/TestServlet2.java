package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/TestServlet2")
public class TestServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//scope 에 저장
		
		request.setAttribute("xxx","홍길동");
		
		HttpSession session =request.getSession();
		session.setAttribute("yyy","이순신");
		
		ServletContext ctx = getServletContext();
		ctx.setAttribute("zzz", "유관순");
		
		RequestDispatcher dis=
				request.getRequestDispatcher("02_bind2.jsp");
		dis.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
