/*HashMap with regnum as key and mark as value. find the avg of marks whose key is odd. 
input:{12:90,35:90,33:90,56:88}
 output:avg of(90+90) =90 
*/
import java.util.*;
public class Coll5 {
      public static int averageOfMarks(Map m1){
            int n = 0,c = 0;
            Iterator i = m1.keySet().iterator();
            while(i.hasNext()){
                  Integer b = (Integer) i.next();
                  if(b%2 != 0){
                        c++;
                        n+=m1.get(b);
                  }
            }
            return (n/c);
      }
      public static void main(String[] args) {
            Map m1 = new HashMap();
            m1.put(12, 90);
            m1.put(35, 90);
            m1.put(33, 90);
            m1.put(56, 88);
            m1.put(36, 67);
            System.out.println(averageOfMarks(m1));
      }
}