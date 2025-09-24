<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
alert("User Registered Successfully");
</script>
<h1>welcome ${user.userName}</h1>
<h1>Your email is ${user.email}</h1>
<h1>Your password is ${user.password}, Try to secure it!</h1>


</body>
</html>