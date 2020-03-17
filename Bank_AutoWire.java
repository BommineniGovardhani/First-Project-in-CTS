package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bank_AutoWire {
	String name;
	String mname;
	Banch b20;
	
	@Autowired
	@Qualifier(value="b11")
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Banch getB20() {
		return b20;
	}
	public void setB20(Banch b20) {
		this.b20 = b20;
	}
	
}
