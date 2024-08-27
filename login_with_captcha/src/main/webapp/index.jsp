<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int captchalength=6;
StringBuilder captcha=new StringBuilder();
Random random=new Random();

captcha.append((char)(random.nextInt(26)+'A'));
captcha.append((char)(random.nextInt(26)+'a'));
captcha.append((char)(random.nextInt(10)+'0'));
char[] specialchars={'!','@','#','$','%','&'};
captcha.append(specialchars[random.nextInt(specialchars.length)]);

String captchaChars="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnopqrstuvwxyz"+"0123456789"+"!@#$%&";
for(int i=4;i<captchalength;i++){
 captcha.append(captchaChars.charAt(random.nextInt(captchaChars.length())));
}

char[] captchaArray=captcha.toString().toCharArray();
for(int i=0;i<captchaArray.length;i++){
 int j=random.nextInt(captchaArray.length);
 char temp=captchaArray[i];
 captchaArray[i]=captchaArray[j];
 captchaArray[j]=temp;
}

String captchaString=new String(captchaArray);
session.setAttribute("captcha",captchaString);

%>


<h1>Login Page</h1>
<form action="login.jsp" method="post">
 <p>User name: <input type="text" name="username"></p>
 <p>Password: <input type="password" name="password"></p>
 <p>Captcha <%= captchaString %></p>
 <input type="hidden" name="generatedCaptcha" value="<%= captchaString %>">
 <p>Enter captcha: <input type="text" name="captchainput"></p>
 <p><input type="submit" value="Login">
</form>

</body>
</html>