package com.wushengde.spring.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans-factory.xml");
		Car car=(Car) ctx.getBean("car1");
		
		Car car2=(Car) ctx.getBean("car2");
		
		System.out.println(car2);
		
		System.out.println(car);
		ctx.close();
	}
}
