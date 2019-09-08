<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	day la trang chu 
</h1>

<form method="post" >
	tai khoan: <input type="text" name="username">
	
		<br>
		<br>
	noi dung:<input type="text" name="text">
	<br>
	<br>
	<input type="submit" value="gui len controller">
</form>

<a href="trang2?param1=hihi&param2=haha">click de den trang thu 2</a>

</body>
</html>
