package com.wushengde.spring;

public class Car {
	private  String brand;
	private String address;
	private double price;
	private int maxSpeed;
	public Car(String brand, String address, double price) {
		super();
		this.brand = brand;
		this.address = address;
		this.price = price;
	}
	
	public Car(String brand, String address, int maxSpeed) {
		super();
		this.brand = brand;
		this.address = address;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", address=" + address + ", price=" + price + ", maxspeed=" + maxSpeed + "]";
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
