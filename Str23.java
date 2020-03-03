/*count the number of words in the string    Input string="i work in cognizant.";    output=4; */
import java.util.*;
 class Str23
{ 
	public static void main(String args[])
	{ 
	Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
 
		int count = 1;
 
		for (int i = 0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
 		System.out.println( count);
	}
}