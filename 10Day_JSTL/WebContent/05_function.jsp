<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>url: 상대경로</h1>
<c:set var="s1" value="    NcS교육과정   "/>
문자열길이:${fn:length(s1)}<br>
대문자:${fn:toUpperCase(s1)}<br>
소문자:${fn:toLowerCase(s1)}<br>
부분열:${fn:substring(s1,0,7)}<br>
공백제거:${fn:trim(s1)}<br>
replace:${fn:replace(s1,"N","XXXx")}<br>
contains1:${fn:contains(s1,"NcS")}<br>
contains2:${fn:contains(s1,"ncs")}<br>
containsIgnore:${fn:containsIgnoreCase(s1,"ncs")}<br>
<c:set var="s2" value="AAA/BBB/CCC"/>
${fn:split(s2,"/")[0]}<br>
${fn:split(s2,"/")[1]}<br>
${fn:split(s2,"/")[2]}<br>
</body>
</html>




