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

/**
 * Servlet implementation class DeptListServlet
 */
@WebServlet("/DeptListServlet")
public class DeptListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		DeptService service = new DeptService();
		List<Dept> list = service.deptList();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		String mesg = "<table border='1'>";
		mesg += "<tr>";
		mesg += "<th>ë¶??„œë²ˆí˜¸</th>";
		mesg += "<th>ë¶??„œëª?</th>";
		mesg += "<th>ë¶??„œ?œ„ì¹?</th>";
		mesg += "</tr>";
		for (Dept dept : list) {
			int deptno = dept.getDeptno();
			String dname = dept.getDname();
			String loc = dept.getLoc();
			mesg += "<tr>";
			mesg += "<td>"+deptno+"</td>";
			mesg += "<td>"+dname+"</td>";
			mesg += "<td>"+loc+"</td>";
			mesg += "</tr>";
		}
		mesg +="</table>";
out.print("<a href='insert.html'>???ž¥?™”ë©?</a>");
		out.print(mesg);
		out.print("</body></html>");
	}//end doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
