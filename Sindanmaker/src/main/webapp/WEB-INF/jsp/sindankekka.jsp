<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>診断結果</title>
</head>
<body>
<h1><img alt="Sindan Maker" src="img/Sindan Maker.png"></h1>
<h2>診断結果！</h2>
<img alt="" src = "${loginUser.jobId }">
<p><c:out value="${loginUser.name }"></c:out>の職業:<c:out value="${loginUser.job }"/></p>
<p>使用武器:<c:out value="${loginUser.weapon }"/></p>
<p>属性:<c:out value="${loginUser.zokusei }"></c:out></p>
<p><a href = "sindan.jsp">診断に戻る</a></p>
<p><a href = "index.jsp">トップに戻る</a></p>
</body>
</html>