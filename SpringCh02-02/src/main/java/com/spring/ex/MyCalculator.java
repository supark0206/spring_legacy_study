package com.spring.ex;

public class MyCalculator {
	private int first;
	private int second;
	private Calculator cal;
	
	
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public Calculator getCal() {
		return cal;
	}
	public void setCal(Calculator cal) {
		this.cal = cal;
	}
	
	public void add() {
		cal.addition(first, second);
	}
	
	public void sub() {
		cal.subrtaction(first, second);
	}
	public void mul() {
		cal.multiplication(first, second);
	}
	public void div() {
		cal.division(first, second);
	}
}
