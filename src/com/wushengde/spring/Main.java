package com.wushengde.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		/*	
		 * 	
		//1.创建HelloWorld的一个对象
		HelloWorld helloWorld=new HelloWorld();
		
		//2.为该对象的name属性赋值
		helloWorld.setName2("郭嘉");
		
		*/
		
		//1.创建Spring的IOC容器对象,即：ApplicationContext对象为IOC容器。 
		/*spring提供了两种类型的IOC容器：ApplicationContext与BeanFactory。
		 * BeanFactory是spring的基础设施，面向spring本身；
		 * ApplicationContext面向使用spring框架的开发者。
		 * ClassPathXmlApplicationContext是ApplicationContext接口的实现类。
		 * */
		
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取Bean实例:利用id定位到IOC容器中的bean
		//HelloWorld helloWorld=(HelloWorld) ctx.getBean("helloWorld");
		//利用类型定位到IOC容器中的bean
		HelloWorld helloWorld2=ctx.getBean(HelloWorld.class);
	
		//3.调用该对象的hello()方法
		helloWorld2.hello();
		
		Car car=(Car) ctx.getBean("car");
		System.out.println(car);
		
		Person person=(Person) ctx.getBean("person");
		System.out.println(person);
		
		Person person2=(Person) ctx.getBean("person2");
		System.out.println(person2);
	}
}
