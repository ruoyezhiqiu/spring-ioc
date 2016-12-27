package com.wushengde.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static  ApplicationContext ctx;
	public static void main(String[] args) {
		ctx=new ClassPathXmlApplicationContext("beans-relation.xml");
		
		/*Address address=(Address) ctx.getBean("address");
		System.out.println(address);*/
		
		Address address2=(Address) ctx.getBean("address2");
		System.out.println(address2);
		
		Person person=(Person) ctx.getBean("person");
		System.out.println(person);
	}
}
