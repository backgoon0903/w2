<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2024-07-30
  Time: 오전 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/ex" method="post">
        <input name="startDate" type="date">
        <input name="endDate" type="date">
        <input name="dueDate" type="datetime-local">
        <button>SEND</button>
    </form>
</body>
</html>
