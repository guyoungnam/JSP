<%@page import="com.dto.BoardDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>    
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
	 <td colspan="5">
	  <form action="BoardListServlet">
	 검색
	   <select name="searchName">
	    <option value="title">제목</option>
	    <option value="author">작성자</option>
	   </select>
	    <input type="text" name="searchValue">
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
<c:forEach var="dto" items="${list}">
	<tr>
	  <th>${dto.num }</th>
	  <th><a href="BoardRetrieveServlet?num=${dto.num }">${dto.title }</a></th>
	  <th>${dto.author }</th>
	  <th>${dto.writeday }</th>
	  <th>${dto.readCnt }</th>
	</tr>
</c:forEach>
</table>
<a href="<c:url value='/BoardWriteUIServlet'/>">글쓰기</a>
</body>
</html>




