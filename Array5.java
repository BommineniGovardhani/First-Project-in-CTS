/* arraylist1={ 1,2,3,4,5}  
  arraylist2={ 6,7,8,9,10} 
size of both list should be same
 output={6,2,8,4,10} 
*/
import java.util.*;
class Array5
{

 	public static void main(String args[])
	{
		int j,sum=0,i;
		int arr[] ={ 1,2,3,4,5};
    		int arr1[]={ 6,7,8,9,10};
		for( i =0;i<arr.length;i++)
		{
			if(i%2==0)
			System.out.println(arr1[i]);
			else
			System.out.println(arr[i]);
		}
			
	}
		
		
		
				
}	
 