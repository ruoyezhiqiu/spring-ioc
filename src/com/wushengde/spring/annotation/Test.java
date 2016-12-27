package com.wushengde.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wushengde.spring.annotation.controller.UserController;
import com.wushengde.spring.annotation.repository.UserRepository;
import com.wushengde.spring.annotation.service.UserService;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans-annotation.xml");
		
		TestObject to=(TestObject) ctx.getBean("testObject");
		System.out.println(to);
		
		UserController userController=(UserController) ctx.getBean("userController");
		System.out.println(userController);
		userController.execute();
		
		UserService userService=(UserService) ctx.getBean("userService");
		System.out.println(userService);
		
		UserRepository userRepository=(UserRepository) ctx.getBean("userRepositoryImpl");
		System.out.println(userRepository);
		
		ctx.close();
		
		
	}
}
