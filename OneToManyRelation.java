package com.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.CustomerPojo;
import com.pojo.VendorPojo;

public class OneToManyRelation {
	public static void main(String args[])
	{
		SessionFactory sessionFactory=new Configuration().
				configure("cts_hibernate.cfg.xml").buildSessionFactory();
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		VendorPojo v=new VendorPojo();
		v.setVid1(10);
		v.setVname1("CTS");
		v.setEmail("cts@outlook.com");
		CustomerPojo c1=new CustomerPojo();
		c1.setCustid(1);
		c1.setCustname("ram");
		CustomerPojo c2=new CustomerPojo();
		c2.setCustid(2);
		c2.setCustname("sam");
		Set s11=new HashSet();
		s11.add(c1);
		s11.add(c2);
		v.setCust1(s11);
		s.save(v);
		t.commit();
		s.close();
		System.out.println("one to many");
		
		
	}

}
