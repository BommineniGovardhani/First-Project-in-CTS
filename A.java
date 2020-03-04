import java.util.*;
import java.util.Arrays;

public class A {
	public static void main(String args[]){
		TreeSet<Integer> i=new TreeSet<Integer>();
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(4);
		
		//System.out.println(i.pollFirst());
		//System.out.println(i.pollLast());
		System.out.println(i.tailSet(3));	
		System.out.println(i.headSet(3));
		System.out.println(i);
	}
		
	}