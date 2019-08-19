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
     // DB연동후 존재하면 세션에 저장
     session.setAttribute("info", userid);
%>	
안녕하세요.<%=userid %>님~~<br>
<a href="mypage.jsp">mypage</a>  


</body>
</html>




