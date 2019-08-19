package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;


public class EmpService {

	//slq ���� ���
	//Ʈ����� 
	
	public List<EmpDTO> selectAll() {
		SqlSession session = MySqlSessionFactory.getSession();
		List<EmpDTO>  list = null;
		EmpDAO dao =new EmpDAO();
		try {
			list = dao.selectAll(session);
		}finally {
			session.close();
		}
		
		return list;
	}

}
