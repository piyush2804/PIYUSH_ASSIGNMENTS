<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p><font color="red">${errorMessage} </font></p>

<form action="/login" method="post">
Enter ur user <input type="text" name="user"/>Enter ur password <input type="password" name="pass"/> 
Enter ur email <input type="text" name="email"/>
<input type="submit" value="Login" />
</form>

</body>
</html>