package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Employee_JdbcTemplate1;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
	     /* HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.message();
		AbstractApplicationContext context1=new AnnotationConfigApplicationContext(AnooBean1.class);
		AnnoBean myBean1=(AnnoBean)context1.getBean("SpringAnnoBean");
		myBean1.display("gova");*/
		
		
		/*EmployeeBean myBean2=(EmployeeBean)context.getBean("myemployee4");
		myBean2.show();

		Student_Cource sc1=(Student_Cource)context.getBean("course1");
		System.out.println(sc1.getId());
		System.out.println(sc1.getName());
		System.out.println(sc1.getCid());
		System.out.println(sc1.getCname());
					
		User_Properties my=(User_Properties)context.getBean("p1");
		System.out.println(my.getName());
		System.out.println(my.getRole());
		System.out.println(my.getEmai());
		 System.out.println("using ref attribute");
		Bank my1=(Bank)context.getBean("bref");
			System.out.println(my1.getName());
			System.out.println(my1.getMname());
			System.out.println(my1.getB1().getCity());
			System.out.println(my1.getB1().getCapital());
			System.out.println("using autowiring");
			Bank my2=(Bank)context.getBean("bref1");
			System.out.println(my2.getName());
			System.out.println(my2.getMname());
			System.out.println(my2.getB1().getCity());
			System.out.println(my2.getB1().getCapital());
		
			System.out.println("using autowiring(constructor)");
			EmployeeBean my3=(EmployeeBean)context.getBean("myemployee2");
			my3.show();
			System.out.println("using autowiring and Qualifier");
			Bank_AutoWire my4=(Bank_AutoWire)context.getBean("auto");
			System.out.println(my4.getName());
			System.out.println(my4.getMname());
			//System.out.println(my4.getB20().getCity());
			System.out.println(my4.getB20().getCapital());
			
		System.out.println("using collections");
		Vendor_Collection my5=(Vendor_Collection)context.getBean("obj1");
		my5.displatInfo();
		System.out.println("collections using dependent object");
		Training_Collection my6=(Training_Collection)context.getBean("tco1");
		my6.displayInfo();
		
		System.out.println("collections Map..using setter Injection");
		Assessment_MapCollection my7=(Assessment_MapCollection)context.getBean("in");
		my7.display();
		*/
		
		/*System.out.println("using collection constructor");
		Vendor_Constuctor my8=(Vendor_Constuctor)context.getBean("q");
		my8.display();*/
		
		Employee_JdbcTemplate1 s=(Employee_JdbcTemplate1)context.getBean("mydatabase");
		
		System.out.println("working with Spring+Jdbc");
		List<Employee_Jdbc> e1=s.listemp();
		System.out.println("Eno  Name   Salary");
		for(Employee_Jdbc rec:e1){
			System.out.println(rec.getEmp_eno()+" ");
			System.out.println(rec.getEmp_name()+" ");
			System.out.println(rec.getSalary()+" ");
			

		}
		SpringAnno_Component s1=(SpringAnno_Component)context.getBean("SpringAnnotationNew");
		System.out.println(s1.training+"   "+s1.loc);
		
		
	
	}

}
