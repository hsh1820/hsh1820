package com.kh.chap1_poly.model.vo;

public class Child1 extends Parent {
	// �ʵ�
	private String str ;
	
	
	// ������
	public Child1() {  // �⺻������
		
	}
	
	public Child1(String str, int num1, int num2) {
		super(num1, num2);		
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public void printChild() {
		System.out.println("Child1 ��ü�� printChild() �޼ҵ� ȣ��");
	}
	
}
