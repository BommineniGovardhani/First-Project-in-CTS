package com.test;

public class Address {
	String city;
	String country;
	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
		System.out.println("address class para");
	}
	public String toString()
	{
		return "Address:"+city +" "+country;
	}

}
