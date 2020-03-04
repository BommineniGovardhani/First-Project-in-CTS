import java.util.*;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	private static Object IdComparator;
	private static Object plist;

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		GregorianCalendar c=new GregorianCalendar();
		Date d2=new Date();
		System.out.println(d2);
		Product p1=new Product(1,"Fredge",10000.0,d);
		Product p2=new Product(2,"tv",10000.0,d);
		Product p3=new Product(3,"AC",10000.0,d2);
		Product p4=new Product(4,"Gas",10000.0,d);
		
		ArrayList<Product> p=new ArrayList<Product>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		for(Product ptr:p){
			System.out.println(ptr);
		}
		NameComparator ndc=new NameComparator();
		/*IdComparator idc=new IdComparator();
		Collections.sort(p,idc);
		System.out.println("after date");
		for(Product ptr:p){
			System.out.println(ptr);
		}
		System.out.println("reverse order");
		Collections.sort(p,Collections.reverseOrder(idc));
		for(Product ptr:p){
			System.out.println(ptr);*/
			Collections.sort(p,ndc);
			System.out.println("using names");
			for(Product ptr2:p){
				System.out.println(ptr2);
			
			}
			System.out.println("reverse order using names");
			Collections.sort(p,Collections.reverseOrder(ndc));
			for(Product ptr:p){
				System.out.println(ptr);
		
		
	}
}
}
