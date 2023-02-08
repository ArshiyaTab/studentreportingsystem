<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Result</h1>

<p th:text="${student.getTotal() }"></p>
<p th:text="${student.getAvgMarks() }"></p>
<p th:text="${student.getTotalAvgPercentage() }"></p>
<p th:text="${student.getMaxAvg() }"></p>
<p th:text="${student.getGrade() }"></p>




</body>
</html>