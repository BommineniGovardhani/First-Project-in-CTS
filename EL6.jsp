<jsp:useBean id="b1" class="com.test.Product" scope="request"></jsp:useBean>
<jsp:setProperty name="b1" property="productno" value="${param.pno}"/>
<jsp:setProperty name="b1" property="productname" value="${param.pname}"/>
<p>Pno(using EL):${b1.productno}
<p>Pno(using Expression Getter):<%=b1.getProductno() %>
<p>Pno(using get Property):<jsp:getProperty name="b1" property="productno"/>
<p>Pname:${b1.productname}