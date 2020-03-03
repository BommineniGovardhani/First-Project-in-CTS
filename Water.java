import java.util.Scanner;
class Water{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
System.out.println("enter size of watermillen" +size);

if(size%2==0){
int n=size/2;
System.out.println(n+"I get"+n+"my sibling get");
System.out.println("possible");
for(int i=1;i<size;i++)
{
System.out.println(i+" "+(size-i));
}
}
else
{System.out.println("cann't possible");}
}
}