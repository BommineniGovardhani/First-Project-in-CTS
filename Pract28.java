import java.util.Scanner;

public class Pract28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//String s=sc.next();
		int n=sc.nextInt();
		System.out.println(check(n));
	}
		static int check(int n)
		{
		int rem;
		int num=0;
		while(n!=0)
		{
			rem=n%10;
			num=(num*10)+rem;
			n=n/10;
			
		}
		return num;
		
	}

}
