/* Create a class which accepts a HashMap and returns the keys in the Map 
Class Name   : MapManager   Method Name   : getKeys Method Description  : Returns the keys in the hasp map Argument   : HashMap Return Type  : Set Logic    : Retrieve the keys in hash map and return the set of keys
*/
import java.util.ArrayList; 
import java.util.*;
 public class Collection4 {
public static void main(String[] args) 
 {
TreeMap<String,String> map=new TreeMap<String,String>();
map.put("c1","Ram");
map.put("c2","Sam");
map.put("c3","Rama");
map.put("c4","Ramu");
map.put("c4","Ramu");
Set<String> key=map.keySet();
for(String s:key)
System.out.println(s);
 
}
}