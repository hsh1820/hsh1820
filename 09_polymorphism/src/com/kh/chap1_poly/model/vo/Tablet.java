package com.kh.chap1_poly.model.vo;

public class Tablet extends Electronic {

	private boolean penFlag;

	
	public Tablet() {
		// TODO Auto-generated constructor stub
	}
	
	public Tablet(String brand, String name, int price, boolean penFlag) {
		super(brand, name, price);
		this.penFlag = penFlag;
	}
	

	public boolean isPenFlag() {// boolean타입 멤버의 getter
		return penFlag;
	}

	public void setPenFlag(boolean penFlag) {
		this.penFlag = penFlag;
	}
	
	
	@Override // 부모가 오버라이딩한 toString 메소드를 한번더 오버라이딩
	public String toString()	{ 
		return super.toString() +", "+ penFlag;
	}
	
}
