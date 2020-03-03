/* pan card number validation:    all letters shud be in caps,shud be of 8 chars.    
first three letters must be alphabets.next 4 letters shud be digits and last letter shud be an alphabet 
*/
import java.util.*;
 
public class Str25 {
 
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1= sc.next();
getvalues(s1);
}
 
public static void getvalues(String s1) {
if(s1.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}"))
{
System.out.println("Valid");
}
else
System.out.println("Invalid");
}
}
