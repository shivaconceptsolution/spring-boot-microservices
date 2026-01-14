<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="additioncode" method="post">
<p>Enter First Number</p>
<p><input type="text" name="num1" placeholder="Enter First Number" /> </p>
<p>Enter Second Number</p>
<p><input type="text" name="num2" placeholder="Enter Second Number" /> </p>
<p><input type="submit"  name="btnsubmit" value="Add" /></p>
</form>
<%
if(request.getAttribute("result")!=null)
{
	out.print(request.getAttribute("result"));
}

%>
</body>
</html>