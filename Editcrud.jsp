<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Edit Employee</h1>  
       <form:form action="/CTS_SpringMaven/editsave" method="get" >    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="eno" /></td>  
         </tr> 
         <tr>    
          <td>Eno : </td>   
          <td><form:input path="eno"  /></td>  
         </tr>  
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>Salary :</td>    
          <td><form:input path="salary" /></td>  
         </tr>      
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>    