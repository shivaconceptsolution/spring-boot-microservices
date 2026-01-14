<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.scs.models.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" style="width:500px;">
<tr><th>Rno</th><th>Name</th><th>Branch</th><th>Fees</th></tr>
<%
List lst = (List)request.getAttribute("stulist");
Iterator it = lst.iterator();
while(it.hasNext())
{
	Student s = (Student)it.next();
%>
<tr><td><%= s.getRno() %></td><td><%= s.getSname() %></td><td><%= s.getBranch() %></td><td><%= s.getFees() %></td>
<td><a href="editstudent?q=<%= s.getRno() %>">Edit</a> | <a href="deletestudent?q=<%= s.getRno() %>">Delete</a></td>
</tr>


<%
}
%>
</table>
</body>
</html>