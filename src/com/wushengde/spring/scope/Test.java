package com.wushengde.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wushengde.spring.autowire.Car;

public class Test {
	private static ApplicationContext ctx;
	public static void main(String[] args) {
		ctx=new ClassPathXmlApplicationContext("beans-scope.xml");
		Car car=(Car) ctx.getBean("car");
		Car car2=(Car) ctx.getBean("car");
		//不同的bean的作用域会返回不一样的值
		System.out.println(car==car2);
	}
}
