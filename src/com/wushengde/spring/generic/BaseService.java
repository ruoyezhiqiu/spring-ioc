package com.wushengde.spring.generic;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {
	
	@Autowired
	protected BaseRepository<T> repository;
	
	public void add(){
		System.out.println("baseservice add...");
		System.out.println(repository);
	}
}
