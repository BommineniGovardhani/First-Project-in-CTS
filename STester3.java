public class STester3 
{ 
public static void main(String[] args) 
{ 
StringBuffer sb1 = new StringBuffer("java");
 StringBuffer sb2 = new StringBuffer("javaaa"); 
boolean stmt1 =sb1.equals(sb2) ;
 System.out.println(stmt1);
boolean stmt2 = sb1 == sb2; 
 System.out.println(stmt2);
String s1 = new String("java");

 String s2 = new String("java"); 
boolean stmt3 = s1.equals(s2);
 System.out.println(stmt3);
 boolean stmt4 = s1 == s2; 
 System.out.println(stmt4);
} 
}


/* Output:false
	  false
	  true
	  false		*/