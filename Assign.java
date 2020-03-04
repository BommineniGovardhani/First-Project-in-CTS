import java.util.Scanner;
import java.util.StringTokenizer;
public class Assign {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    getdata(s1);
  }
  public static void getdata(String s1) {
    
    String[]c=s1.split(" ");
    int len=c.length;
    if(len==3){
    StringTokenizer st = new StringTokenizer(s1, " ");
    String s2 = st.nextToken();
    String s3 = st.nextToken();
    String s4 = st.nextToken();
   System.out.print(s4);
   System.out.print(" "+s3.charAt(0));
   System.out.print(". "+s2.charAt(0));
  }
    else
    {
    	StringTokenizer st = new StringTokenizer(s1, " ");
        String s2 = st.nextToken();
        String s3 = st.nextToken(); 
       System.out.print(s3);
       System.out.print(" "+s2.charAt(0));
       
    }
}
}
