<body bgcolor="orange" text="white">
<jsp:useBean id="b1" class="com.test.Product" scope="session"/>
<jsp:setProperty name="b1" property="productno" param="a1"/>
<jsp:setProperty name="b1" property="productname" param="b1"/>
<h1>Pno:</h1>
<jsp:getProperty name="b1" property="productno" />
<h1>PName</h1>
<jsp:getProperty name="b1" property="productname" /><p>
<a href="Bean3.jsp">Next page</a>

</body>