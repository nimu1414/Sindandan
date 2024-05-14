<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/Sindankekka.css">
<meta charset="UTF-8">
<title>診断結果</title>
</head>
<body>
<h1><img alt="Sindan Maker" src="img/Sindan Maker.png" onclick = "execute()"></h1>
<h2><img alt="" src="img/Sindankekkah2.png" height="15%" width="15%"></h2>
<img alt="" src = "${loginUser.jobId }" height="300px" width="300px">
<div class = "box14">
<p><c:out value="${loginUser.name }"></c:out>の職業:<c:out value="${loginUser.job }"/></p>
<p>使用武器:<c:out value="${loginUser.weapon }"/></p>
<p>属性:<c:out value="${loginUser.zokusei }"></c:out></p>
</div >
<p class= "textlink textlink02"><a href = "sindan.jsp">診断に戻る</a>
<a href = "index.jsp">トップに戻る</a></p>
<script type="text/javascript">
    // サーブレットにリクエストを投げる
    function execute() {
        location.href = "index.jsp"
    }
</script>
</body>
</html>