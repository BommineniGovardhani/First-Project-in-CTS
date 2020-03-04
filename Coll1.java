import java.util.*;
public class Coll1 {
	public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr1[]=new int[n];
int arr2[]=new int[n];
int sum=0;
List<Integer> l=new ArrayList<Integer>();
{
	

for(int i=0;i<n;i++)
{
	arr1[i]=sc.nextInt();
	l.add(arr1[i]);
	
}
List<Integer> l1=new ArrayList<Integer>();{
System.out.println(l);
for(int i=0;i<n;i++)
{
	arr2[i]=sc.nextInt();
	l1.add(arr2[i]);
	
}
System.out.println(l1);


l.retainAll(l1);
System.out.println(l);
for(int i:l)
{
sum=sum+i;	
}
System.out.println(sum);
}
}
}
}