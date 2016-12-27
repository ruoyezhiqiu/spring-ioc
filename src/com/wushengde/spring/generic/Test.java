package com.wushengde.spring.generic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//测试泛型依赖注入，注入的bean是该泛型父类的实现类
public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans-generic.xml");
		
		UserService userService=(UserService) ctx.getBean("userService");
		userService.add();
		ctx.close();
	}
}
