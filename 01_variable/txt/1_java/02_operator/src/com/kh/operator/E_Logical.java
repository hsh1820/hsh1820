package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	
	// ���� ������
	/*
	 * ���� �� �ΰ��� ���ϴ� ������
	 * AND (&&) : �׸���, ~�鼭
	 * OR  (||) : �Ǵ� , ~�ų�
	 * 
	 * */
	public void method1() {


		// �Է¹��� ������ 1 ~ 100 ������ ������ Ȯ���ϱ�
		//int i ;
		//boolean isTrue = true;
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		input=sc.nextInt();
		
		boolean isTrue = (input >= 1) && (input <=100);
		
		System.out.println(input + "��/�� 1���� 100���� �� : " + isTrue);
		
		
		
		//		
		//		while(tf == true) {
		//			System.out.print("���� �Է� : ");
		//			
		//			i=sc.nextInt();
		//			
		//			if (i>0 && i<100) {
		//					System.out.println("true");					
		//				}
		//			else {
		//					System.out.println("false");
		//					isTrue=false;
		//					break;
		//				}
		//			}
		}

	public void method2() {
		// �Է¹��� ���ڰ� ���� �빮������ Ȯ���ϱ�
		char ch;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		ch=sc.next().charAt(0);
		
		//		int input = ch;// �ڵ�����ȯ
		//		
		//		boolean isTrue = (input >= 65) && (input <= 90 );
		//		
		
		
		boolean isTrue = (ch >= 'A') && (ch <='Z');
		
		
		System.out.println(ch + "��/�� ���� �빮�� : " + isTrue);
		
		
	}
	
	public void method3() {
		//�Է¹��� ���ڰ� ������ (��, �ҹ��� ����X) Ȯ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		
		while(isTrue == true) {
		
		System.out.print("���� �Է� : " );
		char ch = sc.next().charAt(0);
		
		
//		int i;
//		i=ch;
//		System.out.print(i);
		
		isTrue = ((ch >='A')&&( ch <='Z')) || ((ch >='a')&&(ch <='z'));
		
		System.out.println(ch+"��/�� �����ΰ�? : "+isTrue);
		
		}
		
		
		
		
	}

	
	


}
