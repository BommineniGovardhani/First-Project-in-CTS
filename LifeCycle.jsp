<%!
int c=10;
public void jspInit()
{
System.out.println("Init");
}
%>
<%
System.out.println("sevice");
c++;
%>
this is page has been called:<%=c %>times
<%!
public void jspDestroy()
{
System.out.println("destroy");
}
%>
