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
String xxx= (String)request.getAttribute("xxx");
String yyy= (String)session.getAttribute("xxx");
String zzz= (String)application.getAttribute("xxx");

%>
일반:<%=xxx %> <br>
일반:<%=yyy %> <br>
일반:<%=zzz %> <br>
EL:${requestScope.xxx}<br>
EL:${sessionScope.xxx}<br>
EL:${apllicationScope.xxx}<br>

</body>
</html>