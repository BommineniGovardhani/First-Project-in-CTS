import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

  public class JavaPro6 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int array[]=new int[n];
    	
    	for(int i=0;i<n;i++)
    	{
    		int number=sc.nextInt();
    		if(number>0)
    		{
    			array[i]=number;
    		}
    		else
    		{
    			System.out.println("invalid, give positive integer");
    			i--;
    		}
    	}
  
     HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

     for (int i = 0; i < array.length; i++) {
        if (data.containsKey(array[i])) {
            Integer count = data.get(array[i]) + 1;
            data.put(array[i], count);
        } else {
            data.put(array[i], 1);
        }
    }
     System.out.println(data);

    Set<Entry<Integer, Integer>> set = data.entrySet();
    ArrayList<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(set);
    Collections.reverse(list);
    Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
    	
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        	
        			     		
        			
        	return (o2.getValue()).compareTo(o1.getValue());
        }
    });
   // Collections.reverse(list);
    for (Entry<Integer, Integer> entry : list) {
        System.out.println(entry.getKey());
    }

 }
}