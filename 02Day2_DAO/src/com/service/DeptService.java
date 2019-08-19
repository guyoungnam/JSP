package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import com.dao.DeptDao;
import com.dto.Dept;

public class DeptService {
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url= "jdbc:oracle:thin:@localhost:1521:orcl";
    String userid = "scott";
    String passwd = "tiger";
	
    public DeptService() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}    
    
 
}// »ý¼ºÀÚ
    
    public List<Dept> deptList() {
    	List<Dept> list = null;
    	Connection con = null;
    	try {
    		con = DriverManager.getConnection(url, userid, passwd);
    		DeptDao dao= new DeptDao();
    		list = dao.deptList(con);
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		try {
    	        
    			if(con!=null)con.close();
    		} catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		
    	}
    	
    	
    	return list;
    }// end deptList

	public int deptInset(Dept dto) {
		int num = 0;
		Connection con = null;
    	try {
    		con = DriverManager.getConnection(url, userid, passwd);
    		DeptDao dao= new DeptDao();
    		num = dao.deptInsert(con, dto);
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		try {
    	        
    			if(con!=null)con.close();
    		} catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		
    	}
    	
		return num;
	}// end 
}
