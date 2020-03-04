import java.util.Scanner;

public class Pract27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		System.out.println(check(s, n));
	}
		static StringBuffer check(String s,int n)
		{
		StringBuffer sb=new StringBuffer();
		sb=sb.append(s.substring(0, n));
		sb=sb.append(s.substring(s.length()-n));
		//System.out.println(sb);
		return sb;
		}
		
	}


