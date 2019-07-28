<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Article details</title>
</head>
<body>
<div style="padding:15px;background-color: #deceb3;color:#74665B; ">
    <h1>${article.title}</h1>
    <p>${article.content}</p>
</div>
<div style="font-size:11px; background-color: rgba(116,102,91,0.96);padding:15px;">
    <div style="color:#DECEB3"><b>Komentarze:</b></div>
    <div style="padding:10px;">
        <c:forEach var="comment" items="${article.comments}">
            <div style="padding-bottom:5px;">
                <div style="font-weight: bold;color:#10d4d3;">${comment.autor}</div>
                <div style="color:lightgoldenrodyellow;">${ comment.content}</div>
            </div>
        </c:forEach>
    </div>
</div>
<div style="font-size:11px; background-color: #deceb3;padding:15px;color:#74665B;">
    <p><b>Dodaj Komentarz:</b></p>
    <form method="post" action="/comments/${article.id}">
        <div><label>Autor:</label><br/><input type="text" name="autor"/></div>
        <div><label>Treść:</label><br/><input type="text" name="content"/></div>
        <input type="submit"/>
    </form>
</div>
</body>
</html>
