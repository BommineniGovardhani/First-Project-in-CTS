import java.util.*;
public class Pract24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int b=User1.check(n);
{
	System.out.println(b);
}
	
}
}

class User1{
	static int check(int n)
	{
		int rem,sum=0;
	
	while(n!=0)
	{
		rem=n%10;
		if(rem%2==0)
		{
			int n1=rem*rem;
			
		
		sum=sum+n1;
	}
		n=n/10;
	
}
	return sum;
}
}