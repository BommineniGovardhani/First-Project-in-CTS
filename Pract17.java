import java.util.Scanner;

public class Pract17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);     
	  	String s=sc.nextLine();
	  	StringBuffer sb=new StringBuffer();
	  	for(int i=0;i<s.length();i++)
	  	{
	  		if(i%2==0)
	  		{
	  			sb.append(s.charAt(i));
	  		}
	  	}
System.out.println(sb);
	}

}
