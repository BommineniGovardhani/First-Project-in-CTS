import java.util.*;
import java.util.ArrayList;
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List l=new ArrayList<>();
l.add(3);
l.add(9);
l.add(7);
l.add(5);
Collections.sort(l);
System.out.println(l);
List l1=new ArrayList<>();
l1.add(2);
l1.add(3);
l.retainAll(l1);
System.out.println(l);
//System.out.println(l.get(2));
{
	
	}
	}

}
