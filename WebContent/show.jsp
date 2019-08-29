<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.student.servlet.*,java.sql.*,org.student.dao.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	Connection conn;
	DBConnection db=new DBConnection();
	conn=db.getconn();
	String sql="select studentname from student where id = ?";
	PreparedStatement cmd=conn.prepareStatement(sql);
	String s=request.getParameter("uid");
	int id=Integer.valueOf(s);
	String name=request.getParameter("uname");
	cmd.setInt(1, id);
	ResultSet rs=cmd.executeQuery();
	while(rs.next()){
		if(rs.getString("studentname").equals(name)){
			out.print("登陆成功");
		}
		else{
			out.print("登陆失败");
		}
	}
	%>	
</body>
</html>