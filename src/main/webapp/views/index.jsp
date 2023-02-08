<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-betal/dist/css/bootstrap.min.css" rel="stylesheet">

<div class="container">
<div class="row">
<div></div>
<h1>Student Marks Calculation</h1>
<form th:action="@{registration}"th:object="${student}"method="post"> 
<div>
<label>Marks 1</label>
<input type="text" id="m1" class="fprm-control" name="m1">
</div>
<div>
<label>Marks 2</label>
<input type="text" id="m2" class="fprm-control" name="m2">
</div>
<div>
<label>Marks 3</label>
<input type="text" id="m3" class="fprm-control" name="m3">
</div>
<div>
<label>Marks 4</label>
<input type="text" id="m4" class="form-control" name="m4">
</div>
<div>
<label>Marks 5</label>
<input type="text" id="m5" class="form-control" name="m5">
</div>
<div>
<label>Marks 6</label>
<input type="text" id="m6" class="form-control" name="m6">
</div>

</br>
<div>
  <input type="submit" value="submit">
</div>



</form>
</div>
</div>

</body>
</html>