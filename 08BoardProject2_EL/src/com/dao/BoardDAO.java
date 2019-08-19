package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.BoardDTO;

public class BoardDAO {

	public List<BoardDTO> listAll(SqlSession session, HashMap<String, String> map) {
		List<BoardDTO> list =
				session.selectList("com.board.BoardMapper.listAll",map);
		return list;
	}

	public void write(SqlSession session, BoardDTO dto) {
		int num = 
			session.insert("com.board.BoardMapper.write", dto);
		
	}

	public BoardDTO selectByNum(SqlSession session, String num) {
		//
		readCnt(session, num);
		BoardDTO dto =
	session.selectOne("com.board.BoardMapper.selectByNum",
			Integer.parseInt(num));
		return dto;
	}
	private void readCnt(SqlSession session, String num) {
		session.update("com.board.BoardMapper.readCnt",
				Integer.parseInt(num));
	}

	public void deleteByNum(SqlSession session, String num) {
		int x = 
	session.delete("com.board.BoardMapper.deleteByNum", 
			Integer.parseInt(num));
		
	}

	public void updateByNum(SqlSession session, BoardDTO dto) {
		int x = 
	session.update("com.board.BoardMapper.updateByNum",dto);
		
	}
}
