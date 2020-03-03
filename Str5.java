/* accept a string and find if it is of date format "dd/mm/yyyy". 
input:01/13/2012 
output:false 
*/
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
 
public class Str5 {
public static void main(String[] args) {
String str = new String();
Scanner sc = new Scanner(System.in);
str = sc.nextLine();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
sdf.setLenient(false);
try {
Date d1 = sdf.parse(str);
System.out.println("TRUE");
} catch (Exception e) {
System.out.println("FALSE");
}
}
}
