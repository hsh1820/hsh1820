package com.kh.operator;

import java.util.Scanner;

public class D_Comparison {
	// �� ������ (== ���迬����) 
	/* - �� �ǿ����ڸ� ���ϴ� ������
	 * - �� �����ڴ� ������ �����ϸ� true/ �ƴϸ� false�� ��ȯ��.
	 * 
	 * a < b	: a�� b���� ������? (a���� b�� �̸��ΰ�?)
	 * a > b	: a�� b���� ū��? (a���� b���� �ʰ��ߴ°�?)
	 * a == b	: a�� b�� ���� ������?
	 * a != b	: a�� b�� ���� �ٸ���?
	 * a <= b	: a�� b���� �۰ų� ������?(a���� b�� �����ΰ�?)
	 * a >= b	: a�� b���� ũ�ų� ������?(a���� b�� �̻��ΰ�?)
	 * 
	 * */
	
	public void method1() {
		int a = 10;
		int b = 25;
		
		boolean result1, result2, result3;
		// ���ʻ� ���� ���� ǥ��(�ǹ����� ��������)
		
		result1 = ( a == b ); // false
		result2 = ( a <= b ); // true
		result3 = ( a > b );  // false
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		System.out.println("a�� ¦�� �ΰ�? : " + ((a%2)==0));
		System.out.println("b�� Ȧ�� �ΰ�? : " + ((b%2)!=0));
		System.out.println("b�� Ȧ�� �ΰ�? : " + ((b%2)==1));
		
		
		
	}

	public void method2() {
		// Ű����� �Է� ���� ���� 3�� ������� Ȯ���ϱ�
		int a;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : " );
		a=sc.nextInt();
		
				
		System.out.println("�Է��� ���ڰ� 3�� ����ΰ�? "+((a%3)==0));
		
		
		/*
		 * int a=0; int i=0;
		 * 
		 * if(i<10) {
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("���� �Է� : " );
		 * a=sc.nextInt();
		 * 
		 * System.out.println("�Է��� ���ڰ� 3�� ����ΰ�? "+((a%3)==0)); i++; }
		 */
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}