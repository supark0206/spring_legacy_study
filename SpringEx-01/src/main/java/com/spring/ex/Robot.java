package com.spring.ex;

public class Robot {
	private String name;
	private String price;
	private String power;
	private String color;
	private String size;
	
	public Robot() {}
	
	public Robot(String name, String price, String power, String color, String size) {
		super();
		this.name = name;
		this.price = price;
		this.power = power;
		this.color = color;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	public void RobotInfo() {
		System.out.println("이름//"+name);
		System.out.println("가격//"+price);
		System.out.println("색상//"+color);
		System.out.println("파워//"+power);
		System.out.println("크기//"+size);
	}
	

}
