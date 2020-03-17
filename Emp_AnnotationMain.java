package com.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.EmpPojo_Annotation;

public class Emp_AnnotationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=new Configuration().
				configure("cts_hibernate.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		EmpPojo_Annotation e1=new EmpPojo_Annotation();
		Scanner scan=new Scanner(System.in);
		System.out.println("Eno:");
		int eno1=scan.nextInt();
		System.out.println("Ename");
		String name1=scan.next();
		System.out.println("Salary:");
		float salary1=scan.nextFloat();
		e1.setEmp_num(eno1);
		e1.setEmp_name(name1);
		e1.setEmp_salary(salary1);
		session.persist(e1);
		System.out.println("command is inserted");
		tx.commit();
		
	}

}
