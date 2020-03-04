import java.util.*;
import java.util.Arrays;

public class Arr {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int n=sc.nextInt();
		String[] s=new String[n];
		for(int i=0;i<n;i++){
		s[i]=sc.next();}
		
		List<String> list=new ArrayList<String>();
		for(int i=0;i<s.length;i++){
		list.add(s[i]);
		}
			
          Collections.sort(list,Collections.reverseOrder()) ;
         
          
		int n = list.indexOf(s1);
		System.out.println(n);
	}
	 
		
		
	}
		



