<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body bgcolor="lightpink">
<h1>Employee List</h1>
<table border="3" width="20%">
<tr><th>EmpNo</th><th>Name</th><th>Salary</th></tr>
<c:forEach var="emp11" items="${emplist}">
<tr>
<td>${emp11.eno}</td>
<td>${emp11.name}</td>
<td>${emp11.salary}</td>
 <td><a href="editemp/${emp.eno}">Edit</a></td>  
<td><a href="deleteemp/${emp.eno}">Delete</a></td> 

</tr>
</c:forEach>
</table>