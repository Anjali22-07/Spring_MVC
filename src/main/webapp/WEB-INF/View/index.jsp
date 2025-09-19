<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import=" java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Testing the working of the program</h1>
<h1>This is homepage,called by Controller</h1>
<h1>url /home</h1>

 <% String name=(String)request.getAttribute("name"); 
 //to add a list dynamically
    
 List<String> friends= (List<String>)request.getAttribute("f");
 
 
 %>
<h1> Hi, This is <%=name %></h1>
<% for(String s: friends){ 
	%>
   <h1>	<%= s %> </h1>
  <% } %>




</body>
</html>