package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeptListServlet")
public class DeptListServlet extends HttpServlet {

	String driver="oracle.jdbc.driver.OracleDriver";
	String url= "jdbc:oracle:thin:@localhost:1521:orcl";
    String userid = "scott";
    String passwd = "tiger";    //인스턴스 변수로
    
    

	public DeptListServlet() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Connection con = null;
	     PreparedStatement pstmt = null;
	     ResultSet rs = null; //로컬변수로 
	     
            try {
            	con = DriverManager.getConnection(url, userid, passwd);
            	String sql = "select deptno x, dname, loc from dept"; 
            	pstmt = con.prepareStatement(sql);
            	rs = pstmt.executeQuery();	
            	
            	
            	response.setContentType("text/html;charset=utf-8");
                PrintWriter out = response.getWriter();
                out.print("<html><body>");
               
String mesg ="<table border='1'>";
       mesg+="<tr>";
       mesg+="<th>부서번호</th>";
       mesg+="<th>부서명</th>";
       mesg+="<th>부서위치</th>";
       mesg+="</tr>";

       
       
        		while(rs.next()) {
        			int deptno = rs.getInt("x");
        			String dname = rs.getString(2);
        			String loc = rs.getString("loc");
        			 mesg+="<tr>";
        		       mesg+="<td>"+deptno+"</td>";
        		       mesg+="<td>"+dname+"</td>";
        		       mesg+="<td>"+loc+"</td>";
        		       mesg+="</tr>";
      
        		}//end while
        		
        		mesg +="</table>";
        		out.print(mesg);
        		out.print("</body></html>");
        		
       out.print("</body></html>");
	}catch(Exception e) {
		
	}finally {
		try {
	        // 7. 자원반납
			
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(con!=null)con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	}//end doGet
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
