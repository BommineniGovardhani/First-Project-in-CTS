import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Pract11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		//String s2=sc.next();
		List l=new ArrayList();
		StringTokenizer st=new StringTokenizer(s,"/");
		while(st.hasMoreTokens())
		{
			StringBuffer sb=new StringBuffer(st.nextToken().toLowerCase());
			l.add(sb.reverse());
		}
		String[] str=new String[l.size()];
		for(int i=0;i<str.length;i++)
		{
			//str[i]=(String) l.get(i);
			System.out.print(l.get(i)+" ");
		}


	}

}
