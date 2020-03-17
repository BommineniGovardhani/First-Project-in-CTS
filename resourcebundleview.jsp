<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page isELIgnored="false"%>
<h2>${msg}</h2>
<a id="en" href="/CTS_SpringMaven/user?lang=en">   English   </a>
<br>
<br>
<a id="fr" href="/CTS_SpringMaven/user?lang=fr">   French   </a>
<h1>
<spring:message code="signmsg"></spring:message>

</h1>