/* Write a java program that allows the user to enter 'n' numbers and finds the number of 
positive numbers entered and the sum of all positive numbers entered using a for loop. 
Sample Input and Output: 
 Enter the value of n 4 
Enter the number 5 
Enter the number -2
 Enter the number -1 
Enter the number 6
*/

import java.util.Scanner;
public class Problem2 {
	
	public static void main(String[] args) 
	{
		int size, i;
		int count = 0;
		Scanner sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		size = sc.nextInt();	
		
		int [] a = new int[size];
		int sum=0;
		
		System.out.print(" Please Enter the  elements of an Array  : ");
		for (i = 0; i < size; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(i = 0; i < size; i++)
		{
			if(a[i] >= 0)
			{
				count++;
			 sum=sum +a[i];
			}
			
		}		
		System.out.println("\n Total Number of Positive Numbers in this Array = " + count);
		System.out.println("\n Sum of Positive Numbers in this Array = " + sum);
		
	}
}