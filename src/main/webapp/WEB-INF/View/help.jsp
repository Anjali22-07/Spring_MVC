<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.time.*" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- <%
   String name=(String)request.getAttribute("name");
   Integer roll=(Integer)request.getAttribute("rollno");
   LocalDateTime time=(LocalDateTime)request.getAttribute("time");
%> --%>
<h1>My name is <%-- <%= name %> --%>  ${name }</h1>
<h1>Roll Number is <%-- <%= roll %> --%> ${rollno }</h1>
<h1>Date and Time:<%-- <% time %> --%> ${time }</h1>

<hr>
<c:forEach var="item" items="${marks }">
<h1>${item }</h1>
</c:forEach>



</body>
</html>