<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
</head>
<body>
<h1>Send an Omikuji!</h1>
<form action='/omikuji/post' method='POST'>
<p>Pick a number from 5 to 25</p>
<input type="number" name="number" min="5" max="25">
<p>Enter the name of any city.</p>
<input type="text" name="city">
<p>Enter the name of any real person</p>
<input type="text" name="person">
<p>Enter professional endeavor or hobby:</p>
<input type="text" name="hobby">
<p>Enter any type of living thing.</p>
<input type="text" name="living">
<p>Say something nice to someone</p>
<textarea name="nice" rows="4" cols="50"></textarea>
<p>Send and show a friend.</p>
<input type='submit' value='Send'>




</form>

</body>
</html>