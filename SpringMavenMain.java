package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMavenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		 FirstMaven sc1=(FirstMaven)context.getBean("stu");
			sc1.diaplay();

	}

}
