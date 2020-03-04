import java.util.*;
import java.util.Map.Entry;
public class Pract21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//String s=;
		//String s=sc.next();
		int i;
		Map<String,String> m=new HashMap<String,String>();
		for( i=0;i<n;i++)
		{
		String s1=sc.next();
		String s2=sc.next();
		m.put(s1,s2);
		}
			System.out.println(m);
			String sam=sc.next();
			ArrayList<String> l=new ArrayList<String>();
			for(Entry <String,String> m1:m.entrySet())
			   
			{
				//m1.getKey();
				m1.getValue();
				if(m1.getValue().equals(sam))
				{
					l.add(m1.getKey());
				}
			}
				//System.out.println(l);
				String[] samp=new String[l.size()];
				for( i=0;i<l.size();i++)
				{
					samp[i]=l.get(i);
					System.out.print(samp[i].toString()+" ");
				}
			
		
	}

}
