<%@ page import="java.util.* " %>
<html>
<body>
<%
String user=request.getParameter("uname");
out.println("<h1> welcome " + user + "</h1>");
Date d=new Date();
out.println("Date is " + d);
%>
</body>
</html>
