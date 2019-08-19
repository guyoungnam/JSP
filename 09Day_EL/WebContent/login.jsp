<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>2. bind</h1>

<%
String userid = request.getParameter("userid");
String passwd = request.getParameter("passwd");
	
%>
userid:<%=userid %><br>
passwd:<%=passwd %><br>

EL:${param.userid}<br>
El:${param.passwd}<br>




</body>
</html>