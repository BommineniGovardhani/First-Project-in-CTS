<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<sql:setDataSource 
var="snapshot"
driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost/test"
user="root" password="Hanuman@456"/>
<sql:query dataSource="${snapshot}" var="res">
select * from emp2 where Salary>1000
</sql:query>
<table border="1">
<tr><th>Eno</th><th>Name</th><th>Salary</th></tr>
<c:forEach var="row1" items="${res.rows}">
<tr>
<td><c:out value="${row1.Eno}" /></td>
<td><c:out value="${row1.Name}" /></td>
<td><c:out value="${row1.Salary}" /></td>
</tr>
</c:forEach>
</table>