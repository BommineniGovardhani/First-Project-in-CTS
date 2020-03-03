/*Write a Program that accepts a string and removes the duplicate characters. */
import java.util.*; 
class Str10 { 
	static String unique(String s) 
	{ 
		String str = new String(); 
		int len = s.length();
		for (int i = 0; i < len; i++) 
		{
		char c = s.charAt(i);
			
			if (str.indexOf(c) < 0) 
			{ 
				str += c; 
			} 
		} 
		
		return str; 
	} 

	
	public static void main(String[] args) 
	{ 
		
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		
		System.out.println(unique(s)); 
	} 
} 
