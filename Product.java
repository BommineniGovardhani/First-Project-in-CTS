import java.util.Scanner;
class Product{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int pro1=sc.nextInt();
int pro2=sc.nextInt();
int pro3=sc.nextInt();
int least=0;
System.out.println("enter Product1 " +pro1);
System.out.println("enter Product2" +pro2);
System.out.println("enter Product3" +pro3);
if(pro1<pro2){
if(pro1<pro3){
least=pro1;}
}
else if(pro2<pro3)
{least=pro2;}
else
{least=pro3;}
int sum=pro1+pro2+pro3;
double off1=(sum*0.2);

if(off1>least)
{
System.out.println("go for offer1");
}
else{System.out.println("go for offer2");}
}
}