import java.util.Scanner;
class Pract26 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int b=User2.check(s);
		if(b==1)
		{
			System.out.println("valid");
		}
		else
			System.out.println("invalid");
	}
	static class User2{
	static int check(String s){
		int b;
		if(s.charAt(0)==s.charAt(s.length()-1))
		{
			b=1;
		}
		else
		{
			b=0;
		}
	
		return b;
	}
}
}