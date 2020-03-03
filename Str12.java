/*String encrption. replace the odd-index character with next character
(if it is 'z' replace with 'a'..if 'a' with 'b' as such), leave the even index as such. return the encrypted string
*/
import java.util.Scanner;
public class Str12 {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String s1 = sc.nextLine();
System.out.println(form(s1));
}
static String form(String s1) {
StringBuffer sb=new StringBuffer();
for(int i=0;i<s1.length();i++){
char c=s1.charAt(i);
if(i%2==0){
if(c==122)
c=(char) (c-25);
else{
c=(char) (c+1);}
sb.append(c);}
else
sb.append(c);}
return sb.toString();
}
}