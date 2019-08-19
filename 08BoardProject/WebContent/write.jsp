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
<h1>게시판 글쓰기</h1>
<form action="BoardWriteServlet" method="post">
제목:<input type="text" name="title"><br>
작성자:<input type="text" name="author"><br>
내용:<textarea rows="10" cols="10" name="content"></textarea>
<input type="submit" value="저장">
</form>
</body>
</html>




