<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<%@ page import="java.util.Date"%>
<%@ page import="java.util.ArrayList,java.util.Random" %>
  <!-- html 주석 -->
  <%--jsp 주석 --%>  
<%!
   //declaration tag ==> 멤버변수/멤버메소드 작성시 사용
   int num=10;
	public void a(){}
%>
<%
	//scriptlet에서 사용한 코드는 변환된 서블릿의 
	// 서비스메서드(doGet/doPost)안에서 적용된다.
	Date d;
	ArrayList x;
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
  String str = "홍길동";
%>
<%= str %>
</body>
</html>