<%--
  Created by IntelliJ IDEA.
  User: phongvt
  Date: 9/19/17
  Time: 9:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/stylesheet.css" type="text/css" media="all"/>
</head>
<body>
    <h2>Greeting : ${greeting}</h2>
<a href="home">Back to home</a>
<a href="/about/home">
    <button class="hello-btn" type="button">Home</button>
</a>
</body>
</html>
