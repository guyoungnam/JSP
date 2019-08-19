<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	 request.setCharacterEncoding("utf-8");
     String userid = request.getParameter("userid");
     String passwd = request.getParameter("passwd");
     
%>
아이디:<%=userid %><br>
비번:<%=passwd %><br>
</body>
</html>




