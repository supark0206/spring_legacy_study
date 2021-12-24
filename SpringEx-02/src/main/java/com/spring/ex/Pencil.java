package com.spring.ex;

public class Pencil {
	private String price;
	private String name;
	private String color;
	public String getPrice() {
		return price;
	}
	
	public Pencil() {}
	
	public Pencil(String price, String name, String color) {
		super();
		this.price = price;
		this.name = name;
		this.color = color;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void pencilInfo(){
		System.out.println("이름 ="+name);
		System.out.println("색상 ="+color);
		System.out.println("가격 ="+price);
	}
	

}
