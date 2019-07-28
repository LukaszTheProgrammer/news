<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Comments list</title>
</head>
<body>
<h1>Articles</h1>
<c:forEach var="comment" items="${comments}">
    <div>${comment.title} - ${comment.publishDate}</div>
</c:forEach>
</body>
</html>
