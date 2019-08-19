<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>forToken0</h1>
<c:forTokens var="z" items="${yyy}" delims="/">
${z}<br>


</c:forTokens>


<h1>forEach3:range</h1>
<c:forEach var="x" begin="1" end="10" step="2">
${X}:World<br>
</c:forEach>

<h1>forEach3:range</h1>
<c:forEach var="x" begin="1" end="5">
${X}:Hello<br>
</c:forEach>


<h1>forEach2:status</h1>
<c:forEach var="person" items="${xxx}" varStatus="status">
index:${status.index}<br>
count:${status.count}<br>
current:${status.current}<br>
first:${status.first}<br>
last:${status.last}<br>
${person.username }
${person.age }<br>
</c:forEach>





<h1>forEach1</h1>
<c:forEach var="person" items="${xxx}">

${person.username }
${person.age }<br>


</c:forEach>


</body>
</html>