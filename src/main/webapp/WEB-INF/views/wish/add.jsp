<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Add a Wish</title>
</head>
<body>
	<form:form method="POST" commandName="wish" class="form-inline" role="form">
	<div class="form-group">
		<form:input path="name" class="form-control" placeholder=": : :- make a wish -: : :" />
		</div>
		<button type="submit" class="btn btn-success">Submit</button>
	</form:form>
</body>
</html>

