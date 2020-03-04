import java.util.Scanner;

public class Pract16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);     
	  	String s=sc.nextLine();
	  	StringBuffer sb=new StringBuffer();
	  	sb.append(s.substring(s.length()-1));
	  	sb.append(s.substring(1, s.length()-1));
	  	sb.append(s.substring(0, 1));
	  	System.out.println(sb);
	}

}
