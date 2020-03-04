import java.util.Scanner;

public class Pract10 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			String s=sc.next();
			String s2=sc.next();
			StringBuffer sb=new StringBuffer(s);
			String s1=s.toLowerCase();
			String[] a=s1.split(s2);
			for(int i=0;i<a.length;i++)
			{
				
				System.out.println(a[i]);
			}
			
		
			
			
	}

}
