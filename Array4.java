/* Retrieve the odd-position digits from input integer array. Multiply them with their index and return their sum. 
*/
import java.util.*;
class Array4
{

 	public static void main(String args[])
	{
		int i,n,sum=0;
		int arr[]=new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array");
		 n = sc.nextInt();
		System.out.println("Enter all values");
		for(i=0;i<n;i++)
		 arr[i] = sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			
		if(i%2==0)
		{
		System.out.println(arr[i]);
		sum=sum+arr[i]*i;
		}
			
		}
		System.out.println("Sum ="+sum);			
	}
}	