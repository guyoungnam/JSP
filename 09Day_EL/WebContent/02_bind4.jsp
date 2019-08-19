<%@page import="com.dto.Person"%>
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
  Person xxx =(Person)request.getAttribute("xxx");

%>
일반:<%=xxx.getUsername() %><br>
일반:<%=xxx.getAge() %><br>

EL:${requestScope.xxx.username}<br>
EL:${xxx.age}<br>

</body>
</html>

