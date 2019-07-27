<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Article</title>
</head>
<body>
<h1>Add new Article</h1>
<form action="/articles" method="post">
    <label>Title:</label>
    <input type="text" name="title"/><br/>
    <label>Content</label>
    <textarea rows="20" cols="150" name="content"></textarea>
    <input type="submit" value="Dodaj"/>
</form>
</body>
</html>
