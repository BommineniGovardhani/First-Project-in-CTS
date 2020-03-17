package com.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojo.Emp_Pojo;

public class EmpViewMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=new Configuration().
				configure("cts_hibernate.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		/*HQL-hibernate query language
		 * it uses the pojo class name instead of table name,and property names instead of column name
		 * 
		 */
		String query1="From Emp_Pojo";
		Query query4=session.createQuery(query1);
		List<Emp_Pojo> list4=(List<Emp_Pojo>)query4.list();
		for(Emp_Pojo e:list4)
		{
			System.out.println(e.getEmpno1()+" "+e.getEmpname()+" "+e.getSalary1());
		}
	
		String SQL_QUERY="select max(e1.salary1) from Emp_Pojo e1";
 query4 = session.createQuery(SQL_QUERY);
		List l1=query4.list();
		System.out.println(l1.get(0));
		Query query5=session.createQuery("from Emp_Pojo where Empname='gova'");
		List l3=query5.list();
		Emp_Pojo obj1=(Emp_Pojo)l3.get(0);
		System.out.println("gova's salary"+obj1.getSalary1());
		
			String q="from Emp_Pojo where Empno1=:a";
			query4=session.createQuery(q);
			System.out.println("enter the eno");
			Scanner sc=new Scanner(System.in);
			int eno11=sc.nextInt();
			query4.setInteger("a", eno11);
			List l2=query4.list();
			Emp_Pojo obj21=(Emp_Pojo)l2.get(0);
			System.out.println("name &salary:"+obj21.getEmpname()+"  "+obj21.getSalary1());
session.close();
	}

}
