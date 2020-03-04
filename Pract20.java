import java.util.Scanner;

public class Pract20{
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            
            String input1=sc.next();
            StringBuffer sb = new StringBuffer(input1);
            int c = 1;
            for(int i = 0;i < sb.length();i++){
                  c = 1;
                  for(int j = i+1;j < sb.length();j++)
                        if(sb.charAt(i) == sb.charAt(j))
                              c++;
                        if(c >= 2){
                              for(int j = i+1;j < sb.length();j++)
                                    if(sb.charAt(i) == sb.charAt(j))
                                          sb.deleteCharAt(j);
                              sb.deleteCharAt(i);
                              i--;
                        }
            }
            System.out.println(sb);
      }
      }
