<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	登陆成功！
	<%
		String n=(String)session.getAttribute("uname");
		out.print(n+"<br/>");
		Cookie[] cookies=request.getCookies();
		for(Cookie cookie:cookies){
			out.print(cookie.getName()+"------"+cookie.getValue());
		}
	%>
</body>
</html>