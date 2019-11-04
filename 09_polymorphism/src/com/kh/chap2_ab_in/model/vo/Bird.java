package com.kh.chap2_ab_in.model.vo;

public  abstract class Bird implements Animal{
	public static final int LEG = 2;
	private int wing;
	
	public Bird() {
		// TODO Auto-generated constructor stub
	}
	public Bird(int wing) {
		this.wing = wing;
	}
	
	
	
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	
	// 일반 메소드 
	public void flappingWing() {
		System.out.println("날개 퍼덕 거리기!");
	}
	
	// 추상 메소드
	public void fly() {} ;
	
	
	@Override  // abstract 클래스가 아닐시 부모 인터페이스의 기능들을 오버라이딩
	public void breathing() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	
}
