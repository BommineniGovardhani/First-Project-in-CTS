<body bgcolor="blue" text="white">
<jsp:useBean id="b1" class="com.test.Product" scope="session"/>
<jsp:getProperty name="b1" property="productno" />
<jsp:getProperty name="b1" property="productname" />
</body>