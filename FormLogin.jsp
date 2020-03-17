<%@page isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>
<form:form action="valid" modelAttribute="result">
Name:<form:input path="name"/><br>
Hobbies:<br>
Shopping<form:checkbox path="f_hobbies" value="Shopping"/><br>
<br>
Eating<form:checkbox path="f_hobbies" value="Eating"/><br><br>
Sleeping<form:checkbox path="f_hobbies" value="Sleeping"/><br><br>
Gender:
Male<form:radiobutton path="gender" value="male"/>
Female<form:radiobutton path="gender" value="female"/>
<br><br>
Country:
<form:select path="country" items="${countryopt}" multiple="true"></form:select>
<input type="submit" value="Submit">
</form:form>
</h1>