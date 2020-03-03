/*Input a int array. Square the elements in even position and cube the elements in odd position and add them as result. input: {1,2,3,4} 
output: 1^3+2^2+3^3+4^2
*/
import java.util.*;
class Array3
{

 	public static void main(String args[])
	{
		int i,sum=0;
		int arr[] ={1,2,3,4};
		for(i=0;i<arr.length;i++)
		{
			if((i+1)%2 == 0)
			arr[i]=arr[i]*arr[i];
			else
			arr[i]=arr[i]*arr[i]*arr[i];
		}
		
		for(i=0;i<arr.length;i++)
		{sum=sum+arr[i];
		System.out.println(arr[i]);
		}
System.out.println(sum);	
	}
}