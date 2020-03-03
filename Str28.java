/* swap the every 2 chrecters in the given string If size is odd number then keep the last letter as it is.   
 Ex:- input: forget 
 output: ofgrte   
 Ex:- input  : NewYork        
 output : eNYwrok
*/ 
import java.util.Scanner;
public class Str28{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    getvalues(s1);
  }
  public static void getvalues(String s1) {
    StringBuffer sb = new StringBuffer();
    int l = s1.length();
    if (l % 2 == 0) {
      for (int i = 0; i < s1.length() - 1; i = i + 2) {
        char a = s1.charAt(i);
        char b = s1.charAt(i + 1);
        sb.append(b).append(a);
      }
      System.out.println(sb);
    } else {
      for (int i = 0; i < s1.length() - 1; i = i + 2) {
        char a = s1.charAt(i);
        char b = s1.charAt(i + 1);
        sb.append(b).append(a);
      }
      sb.append(s1.charAt(l - 1));
      System.out.println(sb);
    }
  }
}