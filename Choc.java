import java.util.Scanner;
class Choc{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int choclates=sc.nextInt();
int child=sc.nextInt();
for(int i=1;i<=child;i++)
{
if( choclates>=i)
{
 choclates= choclates-i;
}
else{
int n=child-(i-1);
System.out.println("remaining choc"+choclates);
System.out.println(" remaining child"+n);
}
}
}
}