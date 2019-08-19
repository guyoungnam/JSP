<%@page import="com.dto.BoardDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>게시판 목록</h1>
<table border="1">

<tr>
<td>
<form action="BoardListServlet">
검색
<select name="searchName">
<option value="title">제목</option>
<option value="author">작성자</option>
</select>
<input  type="text" name="searchValue"> 
<input type="submit" value="검색">
</form>
</td>
</tr>

	<tr>
	  <th>글번호</th>
	  <th>제목</th>
	  <th>작성자</th>
	  <th>작성일</th>
	  <th>조회수</th>
	</tr>
<%
   List<BoardDTO> list=
   (List<BoardDTO>)request.getAttribute("list");
   for(BoardDTO dto: list){
	   int num = dto.getNum();
	   String title = dto.getTitle();
	   String author = dto.getAuthor();
	   String writeday = dto.getWriteday();
	   int readCnt = dto.getReadCnt();
%>	
	<tr>
	  <th><%= num%></th>
	  <th><a href="BoardRetrieveServlet?num=<%= num%>"><%= title%></a></th>
	  <th><%= author%></th>
	  <th><%= writeday%></th>
	  <th><%= readCnt%></th>
	</tr>
<%
   }//end for
%>	
</table>
<a href="BoardWriteUIServlet">글쓰기</a>
</body>
</html>




