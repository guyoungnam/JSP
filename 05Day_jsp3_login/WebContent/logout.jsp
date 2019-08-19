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
   로그인이 필요한 작업입니다.
   <a href="loginForm.html">로그인화면</a>
<%
	 }else{
		session.invalidate();
%>
정상적으로 로그아웃 성공.
<% 
	 }//end if
%>

</body>
</html>




