import java.util.*;
public class Pract25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		//String s2 = null;
		//String s2=s.substring(s.length()/2-1, s.length()/2+1);
		System.out.println(chek(s));

	}
	static String chek(String s)
	{
		String s2=s.substring(s.length()/2-1, s.length()/2+1);
		return s2;	
	}

}
