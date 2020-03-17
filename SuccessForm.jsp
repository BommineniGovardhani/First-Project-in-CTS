<body>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>
Name:${result12.name}
<br>
Hobbies:

<c:forEach var="hoblist" items="${result12.f_hobbies}">
<li>${hoblist}</li>
</c:forEach>

<br>
Gender:${result12.gender}<br>
Country:${result12.country}<br>


</h1>
</body>