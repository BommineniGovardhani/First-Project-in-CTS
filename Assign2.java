import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

class Assign2{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      Map m = new HashMap();
      int n=in.nextInt();
      in.nextLine();
      
      
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         long phone=in.nextLong();
        
        
          
         in.nextLine(); 
         
         m.put(name,phone);
         
        
      while(in.hasNext())
      {
         String s=in.nextLine();
          if (m.containsKey(s)) {
              System.out.println(s + "=" + m.get(s));
          }
          else {
              System.out.println("Not found");
          }
      }
   }
}
}