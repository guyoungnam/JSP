package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.Dept;
import com.exception.DuplicatedException;

public class DeptDAO {

	public List<Dept> deptList(Connection con) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Dept> list = new ArrayList<Dept>();
		try {
			String sql = "select deptno x,dname,loc from dept order by 1 ";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int deptno = rs.getInt("x");
				String dname = rs.getString(2);
				String loc = rs.getString("loc");
			  Dept dept = new Dept(deptno, dname, loc);
			  list.add(dept);
			} // end while
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return list;
	}

	public int deptInsert(Connection con, Dept dto) 
	throws DuplicatedException{
		int num = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "insert into dept (deptno,dname,loc) "
					+ " values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
		    num = pstmt.executeUpdate();
	
		}catch(Exception e) {
throw new DuplicatedException(dto.getDeptno()+"�? 중복?��.");
		}finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return num;
	}

}
