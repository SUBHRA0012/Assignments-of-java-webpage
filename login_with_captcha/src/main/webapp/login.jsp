<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String captchainput=(String) request.getParameter("captchainput");

String captchaString=(String) session.getAttribute("captcha");
if(captchaString!=null && captchaString.equals(captchainput)){
 out.print("Login Successful");
 }
else{
 out.print("Login fail");
 }
 %>
</body>
</html>