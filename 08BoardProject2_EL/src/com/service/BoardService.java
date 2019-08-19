package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.BoardDAO;
import com.dto.BoardDTO;

public class BoardService {

	public List<BoardDTO> listAll(HashMap<String, String> map) {
		
		SqlSession session =MySqlSessionFactory.getSession();
		List<BoardDTO> list = null;
		BoardDAO dao = new BoardDAO();
		try {
			list = dao.listAll(session,map);
		}finally {
			session.close();
		}
		return list;
	}

	public void write(BoardDTO dto) {
		SqlSession session =MySqlSessionFactory.getSession();
		BoardDAO dao = new BoardDAO();
		try {
			dao.write(session,dto);
			session.commit();
		}finally {
			session.close();
		}
		
	}

	public BoardDTO selectByNum(String num) {
		SqlSession session =MySqlSessionFactory.getSession();
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = null;
		try {
			dto = dao.selectByNum(session,num);
			session.commit();
		}finally {
			session.close();
		}
		return dto;
	}

	public void deleteByNum(String num) {
		SqlSession session =MySqlSessionFactory.getSession();
		BoardDAO dao = new BoardDAO();
		try {
			dao.deleteByNum(session,num);
			session.commit();
		}finally {
			session.close();
		}
		
	}

	public void updateByNum(BoardDTO dto) {
		SqlSession session =MySqlSessionFactory.getSession();
		BoardDAO dao = new BoardDAO();
		try {
			dao.updateByNum(session,dto);
			session.commit();
		}finally {
			session.close();
		}
		
	}

}
