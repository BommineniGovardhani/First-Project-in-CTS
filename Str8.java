/* Find no of characters in a given string which are not repeated.
 input: "hello" 
output: 3 
*/
import java.util.*;
public class Str8 { 
    static final int num = 256; 
       
    static int c=0;
    static void print(String str) 
    { 
        
        int[] count = new int[num]; 
       
        
        int i; 
        for (i = 0; i < str.length(); i++) 
            if(str.charAt(i)!=' ') 
                count[(int)str.charAt(i)]++; 
        int n = i; 
       
        
        for (i = 0; i < n; i++) 
            if (count[(int)str.charAt(i)] == 1) 
c++;
                System.out.print(c); 
    } 

    public static void main(String args[]) 
    { 
Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        print(s1); 
    } 
} 