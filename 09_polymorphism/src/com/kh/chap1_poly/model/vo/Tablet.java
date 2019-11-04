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
	

	public boolean isPenFlag() {// booleanŸ�� ����� getter
		return penFlag;
	}

	public void setPenFlag(boolean penFlag) {
		this.penFlag = penFlag;
	}
	
	
	@Override // �θ� �������̵��� toString �޼ҵ带 �ѹ��� �������̵�
	public String toString()	{ 
		return super.toString() +", "+ penFlag;
	}
	
}
