package com.kh.chap2.loop;

import java.util.Scanner;

public class A_For {
	
	// 1. for�� ( ���� for��)
	/*
	 * for( �ʱ��; ���ǽ�; ������) {
	 * 		����� ����;
	 *	}
	 *
	 *	1ȸ�� (ó�� for���� ����Ǵ� ���)
	 *	�ʱ�� -> ���ǽ� Ȯ�� -> (���ǽ��� true �� ��) ���� ���� ����/ (���ǽ� false �� ��) for�� �ǳʶ�
	 *	-> ������ ���� 
	 * 
	 * 	2ȸ�� (ó�� for���� ����Ǵ� ���)
	 *	���ǽ� Ȯ�� -> (���ǽ��� true �� ��) ���� ���� ����/ (���ǽ� false �� ��) for�� �ǳʶ�
	 *	-> ������ ����
	 * 
	 * 	*/
	
	public void method1() {
		// 1���� 5���� 1�� �����ϸ� ����ϱ�
		for(int i = 1;i<=5;i++) System.out.println(i);		
		for(int i = 0;i<5;i++) System.out.println(i+1);
		
	}
	
	public void method2( ) {
		// 0���� 10���� 1�� ����
		System.out.println();
		System.out.println();
		
		String[] str;
		
		
		for(int i=0; i <= 10 ; i++) {
			System.out.println(i + "��° �ݺ�");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	//public void method3() {
	//		// 1���� 10 ������ Ȧ���� ���
	//		// 1 3 5 7 9
	//		for(int i =1; i<=10;i+=2) {
	//			System.out.print(i+" ");
	//		}
	//		
	//	//}
	
	public void method3( ) {
		// 10���� 1���� ¦�� ���(����)
		// 10 8 6 4 2 
		for(int i = 10; i >= 1; i -= 2) {
			System.out.print(i + " ");
		}
	}

	public void method4() {
		// 2���� 9������ ������ �Է¹޾�
		// �ش� ���� ������ ����ϱ�
		// ��, 2~9���� ���� �ƴϸ�
		// "�߸� �Է��ϼ̽��ϴ�." ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է�(2~9): ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) {
			// ������ ���
			for(int i = 1;i>10;i++)	{			
			System.out.println(dan + " x " + i + " = "+ (dan*i));
			}
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		//		//for(int dan = sc.nextInt() ; dan > 2|| dan < 10; ) {
		//			
		//		}
		
	}
	
	public void method5() {
		// 1���� 10 ������ ������ �� 5���� �հ� ���ϱ�
		//           (���� == random)
		int sum = 0; // �հ踦 ������ ����
		
		for(int i =1;i<=5;i++) {
			int ran = (int)(Math.random() * 10 + 1);
			// 0 <= ran = Math.random() < 1 (�Ǽ�)
			// 0 <= Math.random() * 10 < 10 (0 ~ 9.99)
			// 1 <= Math.random() * 10+1 < 11 (1 ~ 10.99)
			// (int)(Math.random() * 10 + 1) --> (1 ~ 10)
			
			System.out.println(ran);
			
			sum += ran; // ������ ����
		}
		
		System.out.println("������ �� : " + sum);

		
	}
	
	public void method6() {
		// Ű����� �� ���� �Է¹޾�
		// ���� ������ ū �� ������ ��� ������ �� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2 : ");		
		int num2 = sc.nextInt();
		
		int swap;
		
		// ���� �� ��ȯ
		if (num1 > num2) {
			swap = num1;
			num1 = num2;
			num2 = swap; 
		}
		
		int sum = 0; // �հ�
		
		for(int i = num1; i <= num2; i++) {
			sum += i;
		}
		
		System.out.println("������ "+ sum + "�Դϴ�.");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
