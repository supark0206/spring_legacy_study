package com.spring.ex;

public class Calculator {	
	private int firstNum;
	private int secondNum;
	
	
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public void add() {
		System.out.println("덧셈");
		System.out.println(firstNum + " + " + secondNum + " = " +(firstNum + secondNum));
	}
	public void sub() {
		System.out.println("뺄셈");
		System.out.println(firstNum + " - " + secondNum + " = " +(firstNum - secondNum));
	}
	public void mul() {
		System.out.println("곱셈");
		System.out.println(firstNum + " * " + secondNum + " = " +(firstNum * secondNum));
	}
	public void dev() {
		System.out.println("나눗셈");
		System.out.println(firstNum + " / " + secondNum + " = " +(firstNum / secondNum));
	}

}
