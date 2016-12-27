package com.wushengde.spring.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	//此实例验证了bean的整个生命周期：从bean的初始化到bean的销毁过程
	public static void main(String[] args) {
		//初始化IOC容器，并初始化bean对象
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans-cycle.xml");
		Car car=(Car) ctx.getBean("car");
		System.out.println(car);
		
		//关闭IOC容器：调用bean的destroy()方法
		ctx.close();
	}
}
