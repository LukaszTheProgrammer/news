<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Article list</title>
</head>
<body>
<h1>Articles</h1>
<a href="/articles/add">Dodaj artykuł</a><br/>
<c:forEach var="article" items="${articles}">
    <div>${article.title} - ${article.publishDate}</div>
</c:forEach>
</body>
</html>
