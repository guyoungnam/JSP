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
import com.exception.DuplicatedException;
import com.service.DeptService;

/**
 * Servlet implementation class DeptListServlet
 */
@WebServlet("/DeptInsertServlet")
public class DeptInsertServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String deptno =request.getParameter("deptno");
		String dname =request.getParameter("dname");
		String loc =request.getParameter("loc");
		
		Dept dto = 
		  new Dept(Integer.parseInt(deptno), dname, loc);
		
		DeptService service = new DeptService();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		int n=0;
		try {
			n = service.deptInsert(dto);
			out.print("???û•?Ñ±Í≥?");
			out.print("<a href='DeptListServlet'>Î™©Î°ù</a>");
		} catch (DuplicatedException e) {
			out.print(e.getMessage()+"???û•?ã§?å®");
			out.print("<a href='insert.html'>???û•?ôîÎ©?</a>");
		}
		out.print("</body></html>");
		
		
	}//end doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
