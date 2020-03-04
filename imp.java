class Base{
void display(){
	System.out.println("base");
}
}
class Sub extends Base{
void display(){
	System.out.println("sub");
}
void displayshape(){
	System.out.println("sub shape");
}

}

public class Imp extends Base {
	void in(Base d){
		d.display();
	
		
	}
	public static void main(String args[]){
		Imp n=new Imp();
		n.display();
		
		Base b=new Base();
		b.display();
		Sub s=new Sub();
		s.display();
		b=s;
		b.display();
		
		//
		//System.out.println(b);
		
	}

}
