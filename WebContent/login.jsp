<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/login.css" type="text/css" />
</head>
<body>
<div class="box">
<h1>管理员登录</h1>
	<form action="loginAction" method="post">
		用户名：<input type="text" name="name"/><br/>
		密&nbsp;&nbsp;码：<input type="password" name="pwd"/><br/>
		<input type="submit" value="登录"/><input type="reset" value="重填"/>
	</form>
	
	</div>
</body>
</html>

