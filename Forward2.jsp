
<%
if((request.getParameter("a1")).equals("Hi"))
{
%>
<jsp:forward page="For1.jsp">
<jsp:param name="user" value="welcome"></jsp:param>
</jsp:forward>
<%
}
else
{
%>
<jsp:forward page="For2.jsp">
<jsp:param name="user1" value="invalid"></jsp:param>
</jsp:forward>
<%
}
%>