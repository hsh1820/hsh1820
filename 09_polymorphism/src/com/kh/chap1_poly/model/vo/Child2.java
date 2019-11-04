package com.kh.chap1_poly.model.vo;

public class Child2  extends Parent{
	// 필드
	private char ch;
	
	
	// 기본생성자
	public Child2()	{
		
	}
	// 매개변수 있는 생성자
	public Child2(int num1, int num2, char ch) {
	super(num1, num2); // 자식 객체안에있는 부모 객체의 생성자에 값 넘김
	this.ch = ch;
	
	}
	
	// getter / setter
	
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	
	public void printChild2()	{
		System.out.println("Child2 객체의 printChild2() 메소드 호출");
	}
	
	
}
