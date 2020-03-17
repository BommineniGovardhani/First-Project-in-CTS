package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.pojo.Emp_Pojo;

public class CriteriaQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=new Configuration().
				configure("cts_hibernate.cfg.xml").buildSessionFactory();
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		Criteria cr=s.createCriteria(Emp_Pojo.class);
		cr.add(Restrictions.gt("salary1",50000.00f));
		cr.add(Restrictions.between("salary1",25000.00f,48000.00f));
		List employees=cr.list();
		List<Emp_Pojo> list4=(List<Emp_Pojo>)cr.list();
		for(Emp_Pojo e:list4)
		{
			System.out.println("first cretiria: "+e.getEmpno1()+" "+e.getEmpname()+" "+e.getSalary1());
		}
		Criteria cr1=s.createCriteria(Emp_Pojo.class);
		cr1.setProjection(Projections.sum("salary1"));
		List totalsalary=cr1.list();
		System.out.println("total salary is  "+totalsalary.get(0));
			
		
	}

}
