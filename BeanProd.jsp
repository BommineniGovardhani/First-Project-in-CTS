<body bgcolor="pink" text="green">
<jsp:useBean id="b1" class="com.test.Product" scope="session"/>
<jsp:setProperty name="b1" property="*"/>
<jsp:getProperty name="b1" property="productno"/>
<jsp:getProperty name="b1" property="productname"/>
Pno:<%=b1.getProductno() %>
PName:<%=b1.getProductname() %>
</body>