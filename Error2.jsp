<%@page errorPage="UserError.jsp"%>
<%
int a1=Integer.parseInt(request.getParameter("a"));
int b1=Integer.parseInt(request.getParameter("b"));
out.println("Answer is: "+a1/b1);
%>