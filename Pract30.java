import java.util.*;
//hello world output =5
public class Pract30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		StringBuffer sb=new StringBuffer(s);
		for(int i=0;i<sb.length();i++)
		{
			int c=0;
			for(int j=i+1;j<sb.length();j++)
			{
					if(sb.charAt(i)==sb.charAt(j))
					{
							sb.deleteCharAt(j);
							j--;
							c++;
					}
			}
		if(c>=1)
		{
			sb.deleteCharAt(i);
			i--;
		
		}
		}	
System.out.println(sb);
	

	}
}
