package com.wushengde.spring.cycle;

public class Car {
	
	private String brand;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Car() {
		super();
		System.out.println("Car's Constructor...");
	}
	
	public void init2(){
		System.out.println("Car'init...");
	}
	
	public void destroy(){
		System.out.println("Car'destroy...");
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}
	
	
}
