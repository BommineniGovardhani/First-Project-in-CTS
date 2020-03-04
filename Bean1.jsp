<body bgcolor="pink" text="white">
<h1>hiii</h1>
<jsp:useBean id="s1"
class="com.test.Product" scope="request"/>
<jsp:setProperty name="s1" property="productno" value="1001"/>
<jsp:setProperty name="s1" property="productname" value="Dell laptop"/>
<h1>Pno:
<jsp:getProperty name="s1" property="productname"/></h1>

</body>