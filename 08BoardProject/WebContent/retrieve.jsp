<%@page import="com.dto.BoardDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

 function updateBoard(e,f){
	 e.preventDefault();
	 f.action="BoardUpdateServlet";
	 f.submit();
 }
 function deleteBoard(e,num){
	 e.preventDefault();
	 location.href="BoardDeleteServlet?num="+num;
 }

</script>
</head>
<body>
<h1>게시판 자세히 보기</h1>
<%
   BoardDTO dto = 
   (BoardDTO)request.getAttribute("retrieve");
int num = dto.getNum();
String title = dto.getTitle();
String author = dto.getAuthor();
String content = dto.getContent();
String writeday = dto.getWriteday();
int readCnt = dto.getReadCnt();
%>
<form name="myForm">
<input type="hidden" name="num" value="<%= num%>">
글번호:<%=num %>&nbsp;작성일:<%=writeday%>
조횟수:<%= readCnt%><br>
제목:<input type="text" name="title" value="<%= title%>"><br>
작성자:<input type="text" name="author" value="<%= author%>"><br>
내용:<textarea rows="10" cols="10" name="content">
<%=content %></textarea>
<button onclick="updateBoard(event ,myForm)">수정</button>
<button onclick="deleteBoard(event,<%= num%>)">삭제</button>
</form>
<a href="BoardListServlet">목록</a>
</body>
</html>




