package com.kh.operator;

public class F_Compound {
	// ���� ���� ������
	/*
	 * �ٸ� �����ڿ� ���� �����ڸ� �Բ� ����ϴ� ������
	 * 
	 * ��� ���� ������ : +=, -=, *=, /=, %= 
	 * 
	 * ���� ���� �����ڸ� ����ϴ� ���� 
	 *	-> ���� ó�� �ӵ��� �ܼ� ���� ���ٵ� �پ� �����Ƿ� ��� ���� 	 
	 * 
	 * */
	public void method1() {
		
		int num = 12;
		// num �� 3����
		num += 3;
		System.out.println("num = num + 3 : " + num); // 15		
		// num �� �� 3������Ű��
		num += 3; // ����ӵ��� �� ����
		System.out.println("num += 3 : " + num); // 18
		// num �� 5���� ��Ű��
		num -= 5;
		System.out.println("num -= 5 : " + num); // 13 
		// num �� 6�� ������Ű��
		num *= 6;
		System.out.println("num *= 6 : " + num); // 78
		// num �� 1/2�� ���ҽ�Ű��
		num /= 2;
		System.out.println("num /= 2 : " + num); // 39
		// num �� 4�� ������ �� ������
		num %= 4;
		System.out.println("num %= 4 : " + num); // 3
	}
	
	
	
	
	
	
	
	
	
	
}