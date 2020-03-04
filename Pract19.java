import java.util.*;
public class Pract19 {
      public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
  		int n1=sc.nextInt();
    	  String[] num=new String[n1];
    	  ArrayList < String > l1 = new ArrayList < String > ();
  		for(int i=0;i<n1;i++)
  		{
  			num[i]=sc.next();
  			l1.add(num[i]);
  		}
      
     
            int op = 0;
            
            for(String s:num)
                  if(s.startsWith("10") || s.startsWith("01") &&(s.length()>2))
                        l1.add(s);
            op = l1.size();
            System.out.println(op);
      }
}