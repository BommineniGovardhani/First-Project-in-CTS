import java.util.*;
public class Pract15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		
		List l1=new ArrayList();
		int num[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			num[i]=sc.nextInt();
			l1.add(num[i]);
		}
		System.out.print(l1+" ");
		List l2=new ArrayList();
		int n2=sc.nextInt();
		int num1[]=new int[n2];
		for(int i=0;i<n2;i++)
		{
			num1[i]=sc.nextInt();
			l2.add(num1[i]);
		}
		System.out.println(l2+" ");
List l3=new ArrayList();
List l4=new ArrayList();
l3.addAll(l1);
l4.addAll(l2);
l1.removeAll(l2);
System.out.print(l1+" ");
l4.removeAll(l3);
l1.addAll(l4);
int arr[]=new int[l1.size()];
for(int i=0;i<arr.length;i++)
{
	arr[i]= (int) l1.get(i);
	System.out.print(arr[i]+" ");
}
	}

}
