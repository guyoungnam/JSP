package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.dao.DeptDAO;
import com.dto.Dept;
import com.exception.DuplicatedException;

public class DeptService {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	public DeptService() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//end ?Éù?Ñ±?ûê
	
	public List<Dept> deptList() {
		List<Dept> list = null;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
DeptDAO dao = new DeptDAO();
		    list = dao.deptList(con);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return list;
	}//end  deptList

	public int deptInsert(Dept dto)
			throws DuplicatedException {
		int num = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
DeptDAO dao = new DeptDAO();
		    num = dao.deptInsert(con,dto);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return num;
	}//end deptInsert
	
}
