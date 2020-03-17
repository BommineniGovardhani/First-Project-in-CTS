package com.test;

abstract class dum1
{
void check()
	{
	System.out.println("abstract class contains only concrete class");
	}
abstract class shopping
		{
		void feedback()
		{
		System.out.println("*********");
		}
	abstract void additem();
	abstract void delietm();
		}
abstract class flipcart extends shopping
	{
	void additem()
	{
	System.out.println("using abstract method");
	}
 class amazon extends shopping
		{
		void additem()
		{
		System.out.println("using normal class ..creating the object for the class we can access the abstract class methods");
		}
void delitem()
	{
		System.out.println("delete items");
	}
		
public class AbstractUsingObject
{
public void main(String args[])
{
//flipcart f=new flipcart();// we can not create the object for abstarct class
//shopping s=new shopping();// we can not create the object for abstarct class
amazon a=new amazon();
a.additem();
a.delitem();
a.feedback();
}

}

@Override
void delietm() {
	// TODO Auto-generated method stub
	System.out.println("hii");
}
		}
}
}