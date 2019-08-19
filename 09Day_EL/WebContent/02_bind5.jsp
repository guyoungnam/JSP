<%@page import="java.util.List"%>
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
  List<Person> xxx =
  (List<Person>)request.getAttribute("xxx");
 for(Person p :xxx){
%>
일반:<%=p.getUsername() %><br>
일반:<%=p.getAge() %><br>
<%
 }
%>
EL:${xxx[0].username}${xxx[0].age}<br>
EL:${xxx[1].username}${xxx[1].age}<br>
</body>
</html>

