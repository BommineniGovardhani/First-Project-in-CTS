/* Write a java program to print all numbers between a and b (a and b inclusive) using a for loop. Input Format: Input consists of 2 integers. The first integer corresponds to a and the second integer corresponds to b. Assume a<=b. Output Format: Refer Sample Input and Output for formatting specifications.
Sample Input and Output: 
Enter the value of a 4 
Enter the value of b 10
 Output: 4 5 6 7 8 9 10 
*/
import java.util.Scanner;
 class Problem9 {
   public static void main( String args[] ) {
      Scanner sc = new Scanner( System.in );
      int a;
      int b;
      int sum;
      int i=0;
     
      System.out.print( "Enter value of a: " );
      a = sc.nextInt();
      System.out.print( "Enter value of b: " );
      b = sc.nextInt();
   for(i=a;i<=b;i++) 
    {
      System.out.println(i);
    }
    }
}
   
  
    