import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Pract29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n1[]=new int[5];
int n2[]=new int[5];
ArrayList l1=new ArrayList();
ArrayList l2=new ArrayList();
for(int i=0;i<5;i++)
{
	n1[i]=sc.nextInt();
	l1.add(n1[i]);
}
for(int i=0;i<5;i++)
{
	n2[i]=sc.nextInt();
	l1.add(n2[i]);
}
 
 ArrayList<Integer> n=new ArrayList<Integer>();
 n=sort(l1,l2);
for(int i=0;i<3;i++)
{
	System.out.println(n.get(i));
}
	}
public static ArrayList<Integer> sort(ArrayList<Integer> l1,ArrayList<Integer> l2){
	
l1.addAll(l2);
System.out.println(l1);
Collections.sort(l1);
ArrayList l3=new ArrayList();
l3.add(l1.get(2));
l3.add(l1.get(6));
l3.add(l1.get(8));
return l3;
//System.out.println(l3);
	}

}
