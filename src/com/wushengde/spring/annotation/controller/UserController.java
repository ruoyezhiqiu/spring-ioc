package com.wushengde.spring.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.wushengde.spring.annotation.service.UserService;

/**
 * 注：当利用注解的方式装配bean时，若IOC容器中有多个匹配类型的bean时，可以采取两种方式解决：
 * 1.给多个bean注解时分配对应的名字如： @Repository("userRepository")，然后以该名字获取；
 * 2.利用@Qualifier("")注解的方式指定对应的bean,注：指定的名字为该bean的类名，且第一个字母小写。
 */
@Controller
public class UserController {
	
	//自动注解：@Autowired：将自动装配IOC容器中该兼容类型匹配的bean
	@Autowired
	private UserService userService;
	
	public void execute(){
		System.out.println("UserController execute...");
		userService.add();
	}
}
