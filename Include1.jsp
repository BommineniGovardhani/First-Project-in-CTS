
<body bgcolor="yellow" text="white">
<%@include file="Sample.jsp" %>
<h1>next....!!!</h1>
<jsp:include page="Inc1.jsp"/>
<jsp:include page="Inc1.jsp">
<jsp:param value="Cts" name="Company"/>
<jsp:param value="9.00" name="Time"/>
</jsp:include>
</body>