import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Pract18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);     
int n=sc.nextInt();
int num[]=new int[n];
int sum=0;
ArrayList l=new ArrayList();
for(int i=0;i<n;i++)
{
	num[i]=sc.nextInt();
l.add(num[i]);
//System.out.println(num[i]);

}
for(int i=0;i<l.size();i++)
{
if(num[i]==13)
{
	i=i+1;
}
else
	sum=sum+num[i];
}
	
	System.out.println(sum);
	}
}
