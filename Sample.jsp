<body bgcolor=yellow>
<%!
int a=1000;
int add(int n,int m)
{
return n+m;
}
%>
<%!
int sub(int n,int m)
{
return n-m;
}
%>
<%
int a1=10;
int a=100;
out.println("<h1> Hello</h1>");
out.println(a+" "+a1);
out.println("<h1> add:"+add(10,10));
%>
<%
out.println("sub: "+sub(10,2));
%>
Add:<%= 10+18 %>
<%="<bgcolor=red>Hiii" %>
<%=a %>
Add method<%=add(20,20) %>
Sub method<%=sub(20,20) %>
