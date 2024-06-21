<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.time.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h3>Hello,Today's date is</h3>
    <%
       LocalDateTime today = LocalDateTime.now();
    out.println(today);
    %>
    
    <h4>End of page</h4>
</body>
</html>