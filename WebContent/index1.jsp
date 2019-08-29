<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Test</title>
</head>
<body>
	<form action="AddStudentServlet" method="post">
		用户名：<input type="text" name="sname"><br/>
		学号：<input type="text" name="snum"><br/>
		密码：<input type="password" name="spwd"><br/>
		<input type="submit" value="注册">
	</form>
</body>
</html>