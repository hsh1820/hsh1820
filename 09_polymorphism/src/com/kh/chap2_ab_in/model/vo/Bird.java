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
	
	// �Ϲ� �޼ҵ� 
	public void flappingWing() {
		System.out.println("���� �۴� �Ÿ���!");
	}
	
	// �߻� �޼ҵ�
	public void fly() {} ;
	
	
	@Override  // abstract Ŭ������ �ƴҽ� �θ� �������̽��� ��ɵ��� �������̵�
	public void breathing() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	
}
