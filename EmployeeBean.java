package com.test;

public class EmployeeBean {
int eno;
String name;
Address addr;
public EmployeeBean(int eno, String name, Address addr) {
	super();
	this.eno = eno;
	this.name = name;
	this.addr = addr;
}
void show()
{
	System.out.println("employee details:"+eno+"  "+name);
	System.out.println(addr);
}
}
