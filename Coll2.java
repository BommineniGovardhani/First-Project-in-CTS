import java.util.*;
public class Coll2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	
		n1=n1-l.get(i);
	//System.out.println(s);
	else
		n1=n1+l.get(i);
	}
	System.out.println(n1+1);
	}

}
