import java.util.*;
import java.util.Date;
class Product {	
		int id;
		String pname;
		double price;
		Date dom;
		public Product(int id,String pname,double price,Date dom)
		{
		this.id=id;
		this.pname=pname;
		this.price=price;
		this.dom=dom;
		}
		public String toString(){
			return "Product ["+this.id+" "+this.pname+" "+this.price+" "+this.dom+"]";
		}

	}

	


