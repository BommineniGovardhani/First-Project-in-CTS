/*write a program :
 GIVEN A STRING 555-666-1234 
DISPLAY AS 55-56-661-234 
*/
import java.util.*;
import java.util.StringTokenizer;
public class Str13 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	System.out.println(display(s));
	}
public static String display(String s) {
	StringTokenizer t=new StringTokenizer(s,"-");
	String s1=t.nextToken();
	String s2=t.nextToken();
	String s3=t.nextToken();
		
	StringBuffer sb=new StringBuffer();
	sb.append(s1.substring(0, s1.length()-1)).append('-');
	sb.append(s1.charAt(s1.length()-1)).append(s2.charAt(0)).append('-');
	sb.append(s2.substring(1, s2.length())).append(s3.charAt(0)).append('-');
	sb.append(s3.substring(1, s3.length()));
	
	return sb.toString();
}
}