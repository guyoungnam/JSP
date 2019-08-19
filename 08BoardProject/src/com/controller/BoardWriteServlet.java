package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.BoardDTO;
import com.service.BoardService;


@WebServlet("/BoardWriteServlet")
public class BoardWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String content = request.getParameter("content");
		
		BoardDTO dto = new BoardDTO();
		dto.setTitle(title);
		dto.setAuthor(author);
		dto.setContent(content);
		
		BoardService service = new BoardService();
		service.write(dto);
		
		response.sendRedirect("BoardListServlet");
		

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


	

}
