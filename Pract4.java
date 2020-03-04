import java.util.HashMap;
import java.util.Iterator;
 
public class Pract4
{
    public static void main(String[] args) throws CloneNotSupportedException 
    {
    	HashMap<Integer, String> map = new HashMap<>();
    	 
    	map.put(1, "A");
    	map.put(2, "B");
    	map.put(3, "C");
    	 
    	System.out.println(map);
    	Iterator<Integer> i=map.keySet().iterator();
    	
    	Integer n=i.next();
    	String s=map.get(n);
    	while(i.hasNext(z))
    	System.out.println("Key= "+n+"   value= "+s);
    	 
    	
    	}
    }
