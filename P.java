import java.util.*;

import java.util.ArrayList.*;

public class P {
	public static void main(String aggs[]){
		/*List l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		boolean flag=l.contains(4);
		System.out.println(flag);
		int n=(int) l.get(2);
		System.out.println(n);
		int n1=l.indexOf(2);
		System.out.println(n1);
		l.remove(2);
		System.out.println(l);
		int n2=l.size();
		System.out.println(n2);*/
		

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		List<Integer> l=new ArrayList<Integer>();
		for(int i=1;i<=n;i++){
			if(i%2!=0)
			{
				l.add(i);
			}
		}
			System.out.println(l);
			int n1=l.get(0);
			for(int i=0;i<l.size();i++){
			if(i%2==0)
			
				n1=n1+l.get(i);
			//System.out.println(s);
			else
				n1=n1-l.get(i);
			}
			System.out.println(n1);
			}

		

	}
	

