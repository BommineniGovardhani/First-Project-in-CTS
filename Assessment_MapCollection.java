package com.test;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assessment_MapCollection {
	int sid;
	String sname;
	Map<String,String> test_details;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Map<String, String> getTest_details() {
		return test_details;
	}
	public void setTest_details(Map<String, String> test_details) {
		this.test_details = test_details;
	}
	void display(){
		System.out.println("Sid "+sid);
System.out.println("Sname "+sname);
	
	Set<Entry<String,String>> set=test_details.entrySet();
	Iterator<Entry<String,String>> itr=set.iterator();
	while(itr.hasNext())
	{
		Entry<String,String> entry=itr.next();
		System.out.println("Key "+entry.getKey()+"  "+"Value "+entry.getValue());
	}
	}	

}
