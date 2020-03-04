import java.util.*;
public class High
{
      public static String diff(String s1){
            StringTokenizer t=new StringTokenizer(s1,"");
            StringBuffer sb1=new StringBuffer();
            sb1.reverse();
            StringBuffer sb2=new StringBuffer();
            
           
      }
      public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter the String:");
            String s1 = s.nextLine();
            System.out.println("the lengthiest string is:"+diff(s1));
      }
}