package com.kh.variable;

public class C_Constant {
	
	// ��� �׽�Ʈ 
	public void finalKeyword() {
		// ���� ���� �� �ʱ�ȭ
		int num1 = 23;
		
		// ��� ���� �� �ʱ�ȭ
		final int NUM2 = 100;
		// --> ����� �̸��� ������ �빮��
		
		
		System.out.println("[������]");
		System.out.println("num1 : " + num1);
		System.out.println("NUM1 : " + NUM2);
		
		// ����, ��� �� ����
		num1 = 24;
		
		// NUM2 = 200;
		// ���� �߻�! ����� ó�� �ʱ�ȭ ���� �� ���� �Ұ�
		
		System.out.println("[������]");
		System.out.println("num1 : " + num1);
		System.out.println("NUM1 : " + NUM2);
		
		final double PI = 3.141592;
		
		
	}
	
}