<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
 <%@ page session="false" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
     request.getParameter("aa");

    request.setAttribute("CCC", "CCC");
	session.setAttribute("AAA", "AAA");
	application.setAttribute("BBB", "BBB");
	out.print("홍길동");
	config.getInitParameter("xxx");
%>
</body>
</html>





