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
<form:form action="studentupdate" method="POST">     
<p>RNO:<form:input path="rno"></form:input></p>
<p>NAME:<form:input path="sname"></form:input></p>
<p>BRANCH:<form:input path="branch"></form:input></p>
<p>FEES:<form:input path="fees"></form:input></p>
<p><input type="submit" value="Update"></p>

</form:form>
<%
if(request.getAttribute("msg")!=null)
{
	out.print(request.getAttribute("msg"));
}

%>
</body>
</html>