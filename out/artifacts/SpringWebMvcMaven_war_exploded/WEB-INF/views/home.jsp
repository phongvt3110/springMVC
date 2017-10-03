<%--
  Created by IntelliJ IDEA.
  User: phongvt
  Date: 9/15/17
  Time: 4:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<%--'<link rel='stylesheet' href=<c:url value="/resources/css/stylesheet.css" /> type='text/css' media='all' />'--%>
<!DOCTYPE html>
<html>
<head>
    <title>Spring 4 MVC Hello World Example with Maven Eclipse</title>
    <link rel='stylesheet' href="${pageContext.request.contextPath}/css/stylesheet.css" type='text/css' media='all' />
</head>
<body>
<h2>Hello World, Spring MVC</h2>

<p>Welcome, ${name}</p>
<button class="hello-btn" type="button" value="Hello again" onclick="location.href='helloagain'">
    Hello again
</button>
<a href="helloagain">Hello again</a>
<a href="helloagain">
    <button class="hello-btn" type="button">Hello again</button>
</a>
</body>
</html>
