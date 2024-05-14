<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>職業診断</title>
<link rel="stylesheet" type="text/css" href="css/Sindan.css">
</head>
<body>
<h1><img alt="Sindan Maker" src="img/Sindan Maker.png" onclick = "execute()"></h1>
<h2>突然異世界に転移!?あなたがついた職業は一体？</h2>
<form action = "Login" method = "post">
<div class="cp_iptxt">
<input type = "text" name = "name" placeholder="お名前(10文字以内)">
<i class="fa fa-user fa-lg fa-fw" aria-hidden="true"></i><br>
</div>
<input type = "submit" value = "診断開始！" class="Form-Btn">
</form>
<script type="text/javascript">
    // サーブレットにリクエストを投げる
    function execute() {
        location.href = "index.jsp"
    }
</script>
</body>
</html>