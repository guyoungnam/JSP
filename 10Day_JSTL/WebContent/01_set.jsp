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

<c:set var="aaa" value="${xxx}" scope="application"/>
이름:${aaa}<br>
이름:<c:out value="${xxx}"></c:out>
이름:<c:out value="${aaa}"></c:out>

</body>
</html>