<html>
<head>
<title> Welcome to dinesh website </title>
</head>
<body>

<%-- CRUD OPERATIONS --%>

<%-- 1.INSERT --%>
<form action="addUser">
Enter Id <input type="text" name="id"><br>
Enter name <input type="text" name="name"><br>
<input type ="submit" >
</form>



<%-- 2.READ --%>
<h2> Display user Information </h2>
<form action="getUser">
Enter Id <input type="text" name="id"><br>
<input type ="submit" >
</form>


<%-- 3.UPDATE --%>
<h2> Enter Details to update </h2>
<form action="updateUser">
Enter Id <input type="text" name="id"><br>
<input type ="submit" >
</form>

<%-- 4.DELETE --%>
<h2> Enter Details to Delete </h2>
<form action="deleteUser">
Enter Id <input type="text" name="id"><br>
<input type ="submit" >
</form>

</body>
</html>
