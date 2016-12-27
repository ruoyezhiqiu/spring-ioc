package com.wushengde.spring;

public class HelloWorld {
	private String name;
	
	public HelloWorld() {
		super();
		System.out.println("helloworld's constructor...");
	}
	public void setName2(String name) {
		System.out.println("setName:"+name);
		this.name = name;
	}
	public void hello(){
		System.out.println("hello "+name);
	}
}
