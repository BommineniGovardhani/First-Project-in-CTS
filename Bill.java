import java.util.Scanner;
class Bill{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int billno=sc.nextInt();
int date=sc.nextInt();
System.out.println("enter billno" +billno);
System.out.println("enter date" +date);
int last=0;
while(billno % 10==0){
last=billno;
 }
if((last==date)||(billno%date==0)){
System.out.println("Lucky");}
else{
System.out.println("non Lucky");}
billno=billno/10;
}
}
