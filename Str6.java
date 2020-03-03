/* Find if a given pattern appears in both the input strings at same postions. 
input1: "hh--ww--" 
input2: "rt--er--" 
output: true(false otherwise) 
*/
import java.util.*;
class Str6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=sc.next();
		if(s.contentEquals(s1))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}