package com.kh.chap1_poly.model.vo;

public class Parent {
	//�ʵ� 
	private int num1;
	private int num2;
	
	// ������
	public Parent() {
		
	}
	
	public Parent(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;				
	}
	
	// �޼ҵ� 
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum2() {
		return num2;
	}
	
	public void print()	{
		System.out.println("Parent ��ü�� print() ȣ���.");
	}
	
	
}
