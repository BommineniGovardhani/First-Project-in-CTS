/* Two input strings are accepted. If the two strings are of same length concat them and return, if they are not of same length, reduce the longer string to size of smaller one, and concat them
input1:"hello" 
input2:"hi" 
output:"lohi" 
input1:"aaa"
 input2:"bbb" 
output:"aaabbb" 
*/

import java.util.Scanner;
class Str4{
public static void main(String args[]){
 Scanner in = new Scanner(System.in); 
   
        String s1 = in.nextLine(); 
 
        String s2 = in.nextLine(); 
if(s1.length()==s2.length()){
System.out.println(s1+s2);
}
else{
int a=s2.length();
String s3=s1.substring(s1.length()-a);
System.out.println(s3.concat(s2));
}
}
}

      