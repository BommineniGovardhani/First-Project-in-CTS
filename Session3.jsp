<%
String username=(String)session.getAttribute("SessionUser");
String password=(String)session.getAttribute("SessionPassword");
out.println("<h1>hii"+username);
out.println("<h1>your password"+password);
session.invalidate();
out.println("<a href=Session1.jsp>Back</a>");
%>