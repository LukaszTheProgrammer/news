<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Article Details</title>
    <style>
        body {
            background-color: blanchedalmond;
        }

        .articleContainer {
            background-color: white;
            padding: 15px;
        }
    </style>
</head>
<body>
<div class="articleContainer">
    <h1>${article.title}</h1>
    <div>${article.content}</div>
    <a href="/articles">Back to articles</a>
</div>
</body>
</html>
