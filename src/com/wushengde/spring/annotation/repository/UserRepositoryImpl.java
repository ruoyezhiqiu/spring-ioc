package com.wushengde.spring.annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wushengde.spring.annotation.TestObject;

@Repository
public class UserRepositoryImpl implements UserRepository {
	
	//Autowired中的required属性若为false，则表示如果IOC容器找不到这个bean，则返回null,不影响程序运行。
	@Autowired(required=false)
	private TestObject testObject;
	
	@Override
	public void save() {
		
		System.out.println("UserRepositoryImpl save...");
		
		System.out.println(testObject);
	}

}
