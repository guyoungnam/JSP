package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.EmpDTO;

public class EmpDAO {

	public List<EmpDTO> selectAll(SqlSession session) {
		List<EmpDTO> list = 
				session.selectList("com.emp.EmpMapper.selectAll");
		return list;
	}

}
