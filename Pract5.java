import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
 
public class Pract5
{
private static Map<String, Integer> getUnSortedMap() 
{
    Map<String, Integer> unsortMap = new HashMap<>();
    unsortMap.put("alex", 1);
    unsortMap.put("david", 2);
    unsortMap.put("elle", 3);
    unsortMap.put("charles", 4);
    unsortMap.put("brian", 5);
    return unsortMap;
}
public static void main(String args[])
{
	Map<String, Integer> unSortedMap = getUnSortedMap();
    
	System.out.println("Unsorted Map : " + unSortedMap);
}
Map<String, Integer> reverseSortedMap = new TreeMap<String, Integer>(Collections.reverseOrder());

reverseSortedMap.putAll(unSortedMap);
         
System.out.println("Reverse Sorted Map   : " + reverseSortedMap);
{
   /* public static void main(String[] args) throws CloneNotSupportedException 
    {
        HashMap<Integer, String> map = new HashMap<>();
         
        map.put(1,  "A");
        map.put(2,  "B");
        map.put(3,  "C");
        System.out.println();
    }
    public static void join()
    {
    	Map<Integer,String> m=U
         
        System.out.println(map.containsValue("A"));
        System.out.println(map.get(2));
        System.out.println(map.get("A"));
        System.out.println(map.isEmpty());
        Iterator<Integer> i=map.keySet().iterator();
        while(i.hasNext())
        {
        	Integer n=i.next();
        	//String s=map.get(n);
        	//String s=i.next(); 
        	System.out.println(n);
        	
        Iterator<Map.Entry<Integer,String>> i=map.entrySet().iterator();
        while(i.hasNext())
        {
        	Entry<Integer,String> e=i.next();
        System.out.println(e.getKey()+"  "+e.getValue());	
        for(Map.Entry<Integer, String> e:map.entrySet())
        {
        	System.out.print(e.getKey());
        	System.out.print(e.getValue());*/
        
        
        
    }
}