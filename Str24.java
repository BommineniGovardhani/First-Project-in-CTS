/* Input1=”cowboy”; Output1=”cowcow”;    Input1=”so”;output1=”sososo”;     
HINT: if they give 3 letter word u have to display 2 time; 
*/
import java.util.*;
public class Str24 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
 String ip1=sc.nextLine();
 String ip2=sc.nextLine();
 System.out.println(print(ip1,ip2));
}
static String print(String ip1,String ip2) {
 StringBuffer sb=new StringBuffer();
 int n1=ip2.length();
 if(n1==3)
  for(int i=0;i<n1-1;i++)
   sb.append(ip1.substring(0, n1));
 else if(n1==2)
  for(int i=0;i<n1+1;i++)
   sb.append(ip1.substring(0, n1));
 return sb.toString();
}
}