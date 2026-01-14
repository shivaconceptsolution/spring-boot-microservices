<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
</head>
<body>
<form:form action="silogic" method="POST">     
<p><form:input path="p"></form:input></p>
<p><form:input path="r"></form:input></p>
<p><form:input path="t"></form:input></p>
<p><input type="submit" value="Calculate"></p>

</form:form>
<%
if(request.getAttribute("result")!=null)
{
	out.print(request.getAttribute("result"));
}

%>
</body>
</html>