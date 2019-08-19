package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.Dept;
import com.service.DeptService;


@WebServlet("/DepInsertServlet")
public class DepInsertServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
		request.setCharacterEncoding("utf-9");
		
		String deptno = request.getParameter("deptno");
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		
		Dept dto = new Dept(Integer.parseInt(deptno),dname,loc);
		
		DeptService service = new DeptService();
		int n =service.deptInset(dto);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		if(n==0) {
			out.print("저장실패");
			out.print("<a href='insert.html'></a>");
		}else {
			out.print("저장성공");
			out.print("<a href='DeptListServlet>목록</a>");
		}
		out.print("</body></html>");
		
	}//end doGet
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
