import java.util.*;
import java.util.Map.Entry;


public class ex {

public static void main(String[] arr) {

/* Create object of HashMap */

HashMap<String, String> map1 = new HashMap<String, String>();

map1.put("India", "New Delhi ");

map1.put("Japan", "Tokyo ");
System.out.print("COUNTRY"+ ": "+" CAPITAL");

System.out.println(map1);
System.out.println("enter key for to find value");
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String captal1 = null ;
Iterator<Map.Entry<String,String>> itr=map1.entrySet().iterator();
while(itr.hasNext())
	
{
	Map.Entry<String, String> entry=itr.next();
	if(entry.getKey().contentEquals(entry.getKey()))
	{
		captal1=entry.getValue();
	}
}
System.out.println(captal1);
System.out.println("enter value for to find key");
//Scanner sc=new Scanner(System.in);
String s2=sc.next();
String captal2 = null ;
Iterator<Map.Entry<String,String>> itr1=map1.entrySet().iterator();
while(itr.hasNext())
	
{
	Map.Entry<String, String> entry=itr.next();
	if(entry.getValue().contentEquals(entry.getValue()))
	{
		captal2=entry.getKey();
	}
}
System.out.println(captal2);


System.out.println("after exchanging key and value");

Map<String, String> my = new HashMap<>();
for(Entry<String, String> entry : map1.entrySet()){
    my.put(entry.getValue(),entry.getKey());
}
System.out.println(my);

}

}
