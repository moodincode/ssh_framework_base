<%--
  Created by IntelliJ IDEA.
  User: leshang
  Date: 2018/7/23
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="user" items="${userList}">
    ${user.id}-${user.name}-${user.sex}-${user.age} ${user.userName}<br/>
</c:forEach>
</body>
</html>
