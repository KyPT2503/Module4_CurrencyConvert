<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Translate</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/translate" class="" method="post">
    <input type="text" value="${word}" name="word">
    <h1>The meaning of ${word} is ${result}</h1>
</form>
</body>
</html>
