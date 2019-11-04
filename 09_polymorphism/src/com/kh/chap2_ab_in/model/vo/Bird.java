package com.kh.chap2_ab_in.model.vo;

public abstract class Bird {
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
	
	public void flappingWing() {
		System.out.println("날개 퍼덕 거리기!");
	}
	
	public abstract void fly() ;
	
	
}
