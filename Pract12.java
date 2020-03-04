import java.util.Scanner;
import java.util.StringTokenizer;
public class Pract12 {
      public static void main(String[] args) {
           // String s = "I work for cognizant";
            Scanner sc=new Scanner(System.in);     
    	  	String s=sc.nextLine();
            //StringTokenizer t = new StringTokenizer(s," ");
            //System.out.println(t.countTokens()); 
    	  	String s1[]=s.split(" ");
    	  	int c=1;
    	  	for(int i=0;i<s1.length-1;i++)
    	  	{
    	  		c++;
    	  	}
    	  	System.out.println(c);
      }
}