package com.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojo.Emp_Pojo;

public class NamedQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=new Configuration().
				configure("cts_hibernate.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		Query query=session.getNamedQuery("CTS_EmpView");
		System.out.println("Eno\t  Name\t  Salary");
		List<Emp_Pojo> list=(List<Emp_Pojo>)query.list();
		for(Emp_Pojo e:list)
		{
			System.out.println(e.getEmpno1()+" "+e.getEmpname()+" "+e.getSalary1());
		}
		Scanner sc=new Scanner(System.in);
		Query query2=session.getNamedQuery("CTS_DeleteRecord");
		System.out.println("enter eno");
		int deno=sc.nextInt();
		query2.setParameter("deleno",deno);
		int result=query2.executeUpdate();
		System.out.println(result+"  record deleted");
	}

}
