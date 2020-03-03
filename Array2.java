/*Get two integer arrays as input. Find if there are common elements in the arrays. find the number of common elements. input1: {1,2,3,4} 
input2: {3,4,5,6}
 output: 4(3,4,3,4) 
*/
import java.util.*;
class Array2
{

 	public static void main(String args[])
	{
		int i,j,k,a;
		int arr2[]=new int[4];
		int arr[] ={1,2,3,4};
		int arr1[] ={3,4,5,6};
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr1.length;j++)
				{
					if(arr[i]==arr1[j]){
					a=arr[i];
					for( k=0;k<arr.length;k++)
					{
						if(arr[k]==a||arr1[k]==a)
						{
							arr2[k]=a;
						
						}
					}
								}
				}			
		}
for(int d = 0 ;d<arr2.length;d++)
{

System.out.print(arr2[d]+" " );


}	




}
}	