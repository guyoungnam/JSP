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
	 //검증하고 세션에 저장
	 String xxx = (String)session.getAttribute("info");
	 if(xxx==null){
%>
   <a href="loginForm.html">로그인화면</a>
<%
	 }else{
%>
안녕하세요.<%=xxx %>님~~<br>
<a href="logout.jsp">로그아웃</a>  
<% 
	 }//end if
%>

</body>
</html>




