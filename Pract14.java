import java.util.*;
public class Pract14 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int n1=1;

String[] s=new String[n];
for(int i=0;i<n;i++)
{
	s[i]=sc.next();
	
}
for(int i=0;i<s.length-1;i++)

	for(int j=i+1;j<s.length-2;j++)
	{
		String s1=s[i];
		String s2=s[j];
if(s1.startsWith(s2)||s2.startsWith(s1))
{
	n1++;
	System.out.println(n1);
}


	}
}
	}

