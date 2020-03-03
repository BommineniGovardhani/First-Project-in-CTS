/*.Write a program which creates a StringBuffer “This is StringBuffer” and performs the following. 1. Adds the string ”- This is a sample program” to existing string and  display it. 2. Inserts the string “Object” into the existing string at 21st postion  and display it. 3. Reverses the entire string and displays it. 4. Replaces the word “Buffer” with “Builder” and display it
*/
class Problemstr1{
public static void main(String args[])
{
String str ="Welcome to Java World";
String str2="Welcome";
String str3=" - Let us learn";
char s1=str.charAt(5);
boolean result1 = str.equalsIgnoreCase(str2); 

String s3=str.concat(str3);
//String s4=str.indexOf('a');
String s5=str.replaceAll("a","e");

System.out.println(s1);
System.out.println(s3);
System.out.println(result1);
 //System.out.println(str.indexOf('a')); 
System.out.println(str.substring(4,10));
System.out.println(str.toLowerCase());
}
}