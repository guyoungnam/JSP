package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {



	@Override
	public void destroy() {
		System.out.println("destroy");

	}

	@Override
	public void init() throws ServletException {
		System.out.println("init"); //요청해서 한번만 생성될때, 실체는 thread, 병행처리가 가능하다
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("doGet"); // 로컬변수 request, response (사용자당 두개 다 가진다)
		
	}

}
