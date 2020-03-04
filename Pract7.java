import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class Pract7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map<String,String> map=new TreeMap<>();
		for(int i=0;i<n;i++){
		String s1=sc.next();
		String s2=sc.next();
		map.put(s1, s2);
		}
	
		System.out.println(map);
		System.out.println(((TreeMap) map).lastKey());
		/*Set<Entry<String, String>> s=map.entrySet();
		for(Map.Entry<String, String> f:s)
		{
			System.out.println(f.getKey()+"-->"+f.getValue());
		}*/
		for(String s:map.keySet())

		{
			System.out.println(s+":   "+map.get(s));
		}
	}

}
