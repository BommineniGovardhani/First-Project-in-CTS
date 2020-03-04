import java.util.*;
import java.util.List.*;
import java.util.ArrayList.*;
public class Pract3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList(){
			{
				add("a");
				add("b");
				add("c");
				add("a");
				
				
			}
		};
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		if(list.remove("a"))
		{
			System.out.println("removed");
		}
		System.out.println(list);
	}

}
