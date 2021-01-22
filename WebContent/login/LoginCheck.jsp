<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	if((username.equals("admin")&&password.equals("admin"))){
		response.sendRedirect("homejsp.jsp");
	}
	else
	{	response.sendRedirect("Error.html");}
	
 %>
</body>
</html>