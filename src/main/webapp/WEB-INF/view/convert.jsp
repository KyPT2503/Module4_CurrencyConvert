<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/convert/" method="post">
    <label>Amount:
        <input type="number" value="${number}" name="number">
    </label>
    <label>Rate:
        <input type="number" value="${rate}" name="rate">
    </label>
    <input type="submit" value="Convert">
    <h1>The result is: ${result}</h1>
</form>
</body>
</html>
