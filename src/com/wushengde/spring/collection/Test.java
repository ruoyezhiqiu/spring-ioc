package com.wushengde.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext ctx;
	public static void main(String[] args) {
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person =(Person) ctx.getBean("person3");
		System.out.println(person);
		
		NewPerson newPerson=(NewPerson) ctx.getBean("newPerson");
		System.out.println(newPerson);
		
		DataSource dataSource=(DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource.getProperties());
		
		Person person5=(Person) ctx.getBean("person5");
		System.out.println(person5);
	}

}
