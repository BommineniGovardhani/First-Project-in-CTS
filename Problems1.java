/*ite a program which creates a String “Welcome to Java World” and perform the following i. Returns the character at 5th position and display it. ii. Compare the above String with “Welcome” lexicographically ignoring case differences and display the result. iii. Concatenates “- Let us learn” to the above string and display it. iv.  Returns the position of the first occurrence of character ‘a’ and display it. v.  Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it. vi. Returns string between 4th position and 10th position and display it. vii. Returns the lowercase of the string and display it 
*/
class Problems1{
public static void main(String args[])
{
String s1 = "javac 67";
String s2 = "javac";
String s3 = "javascript";
String s4 = "java11script";
System.out.println(s1.compareTo(s2));

System.out.println(s1.compareTo(s2));
System.out.println(s1.trim(s3));
System.out.println(s3.compareTo(s1));
System.out.println(s4.substring(6));
}
}