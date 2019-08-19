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
  //서블릿 이라면
  String userid2 = getServletContext().getInitParameter("userid");
  
  //JSP에서 Context 파라미터 얻기

  String userid = application.getInitParameter("userid");
  String email = application.getInitParameter("email");

%>
서블릿:<%=userid2 %><br>
JSP:<%=userid %><br>
JSP:<%=email %><br>
EL:${initParam.userid }<br>
EL:${initParam.email }<br>


</body>
</html>