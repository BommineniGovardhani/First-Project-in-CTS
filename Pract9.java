import java.util.Scanner;

public class Pract9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		String s2=sc.next();
		cal(s,s2);
		
	}
		public static void cal(String s,String s2)
		{
			StringBuffer sb=new StringBuffer();
			int len=s2.length();
		if(len==3)
		{
			for(int i=0;i<len-1;i++)
			{
				sb.append(s.substring(0,len));
			}
			System.out.println(sb);
		}
		else if(len==2)
		{
			for(int i=0;i<len+1;i++)
			{
				sb.append(s.substring(0,len));

		}
			System.out.println(sb);
		}
	}

}
