import java.util.*;
public class Pract23 {
 public static void main(String[] args)
 {
 Scanner s=new Scanner(System.in);
 String number=s.next();
 int r=User.validateNumber(number);
 if(r==1)
 {
 System.out.println("Valid number format");
 }
 else
 {
 System.out.println("Invalid number format");
 }
 s.close();
 }
}
//import java.util.*;
 class User {
 public static int validateNumber(String number)
 {
 int b;
 if(number.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"))
 {
 b=1;
 }
 else
 {
 b=0;
 }
 return b;
 }
}