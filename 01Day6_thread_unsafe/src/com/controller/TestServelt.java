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
	
	
	//�ν��Ͻ� ����, static ����  ==> �������� (thread-unsafe)
	int num;
	ArrayList<String> list = new ArrayList<String>();
	



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //���ú��� ==> �����Ұ� ==> thread-safe
		int size = 10; 
		num++;
         list.add("ȫ�浿");
         System.out.println("doGet"+num);
         System.out.println("doGet"+list);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
