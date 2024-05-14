<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>診断メーカー</title>
<link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
<div class = "box15">
<h1><img alt="Sindan Maker" src="img/Sindan Maker.png" onclick = "execute()"></h1>
<h2>今遊べる診断↓</h2>
<p class= "textlink textlink02"><a href = "sindan.jsp">突然異世界に転移!?あなたがついた職業は一体？</a></p>
<br>

<p>時間なくてこれだけしか作れませんでした;;</p>
<script type="text/javascript">
    // サーブレットにリクエストを投げる
    function execute() {
        location.href = "index.jsp"
    }
</script>
</div>
</body>
</html>