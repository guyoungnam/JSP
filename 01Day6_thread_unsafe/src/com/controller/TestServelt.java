package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServelt")
public class TestServelt extends HttpServlet {
	
	
	//인스턴스 변수, static 변수  ==> 공유가능 (thread-unsafe)
	int num;
	ArrayList<String> list = new ArrayList<String>();
	



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //로컬변수 ==> 공유불가 ==> thread-safe
		int size = 10; 
		num++;
         list.add("홍길동");
         System.out.println("doGet"+num);
         System.out.println("doGet"+list);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
