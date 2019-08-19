package com.cotroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GetCookiesServlet")
public class GetCookiesServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                
		// 1. 요청에서 쿠키 얻기
		Cookie[] cookies =request.getCookies();
		for (Cookie c : cookies) {
			if("username".contentEquals(c.getName())) {
			String name = c.getName();
			String value = c.getValue();
			System.out.println(name+"\t"+value);
		}
	}

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
