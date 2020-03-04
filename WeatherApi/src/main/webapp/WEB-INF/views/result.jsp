<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="/style.css" />
<meta charset="ISO-8859-1">
<title>Weather</title>
</head>
<body>
	<div>
		<h2>${weather.productionCenter}</h2>
		<h2>Area Description: ${weather.location.areaDescription}</h2>
		<h2>Time Zone: ${weather.location.timezone}</h2>
	</div>
	<div>
		<h3>Day:</h3>
		<c:forEach var="Stuff" items="${weather.time.startPeriodName}">
			<h6>${Stuff}</h6>
		</c:forEach>
	</div>
	<div>
		<h3>Forecast:</h3>
		<c:forEach var="Stuff" items="${weather.data.text}">
			<h6>${Stuff}</h6>
		</c:forEach>
	</div>






</body>

<a href="/" class="btn btn-secondary">Back home</a>

</html>