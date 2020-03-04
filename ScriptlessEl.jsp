<body bgcolor="pink" text="blue">
${10+10}<p>
${10 ge 10}<p>
${10 < 10}<p>
${10 lt 10}<p>
${header["host"]}
${"Welcome"}
<%
session.setAttribute("name","gova");
%>
session value:${sessionScope.name}