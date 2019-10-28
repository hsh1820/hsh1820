package com.kh.chap1.condition;

import java.util.Scanner;

public class A_If {
	
	// �ܵ� if ��
	/*
	 * if(���ǽ�) {
	 * 
	 * 		������ �ڵ� �ۼ�
	 * 
	 * }
	 * --> ���ǽ��� true �̸� ����({}) �� �ڵ� ����
	 * --> ���ǽ� �� false �̸� ����({}) �� �ǳ� ��
	 * 
	 * */
	
	public void method1() {
		// �Է¹��� ������ ����� "�����"
		// �ƴϸ�, "����� �ƴϴ�" ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		if (input > 0) System.out.print("�����");
		//if (input <= 0) System.out.print("����� �ƴϴ�");

		
		// ������ 0�� �������� ���
		if (input < 0) System.out.print("������");
		if (input == 0) System.out.print("0�̴�");
		
		
	}

	public void method2( ) {
		// �Է¹��� ������ ¦������ Ȧ������ ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int input = sc.nextInt();
		
		if(input % 2 == 0) {
			System.out.println("¦����.");
		} else {
			System.out.println("Ȧ����.");
		}	
		
		sc.close();
		
		
	}

	public void method3( ) {
		// �Է¹��� ��(��)�� �´� ���� ����ϱ�
		// ��, 1~12 ���̿� ���� �ƴϸ� 
		// "�ش��ϴ� ������ �����ϴ�." ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��(��)�� �Է��� �ּ��� : ");
		int month = sc.nextInt();
		
		String season;
		// �� 3, 4, 5
		if (month >= 3 && month <= 5) {
			season = "��";			
		}else if (month >=6 && month <= 8) {
			season = "����";
		}else if (month >=9 && month <= 11) {
			season = "����";
		}else if (month ==12 || month == 1 || month == 2) {
			season = "�ܿ�";
		}else season = "�ش��ϴ� ������ �����ϴ�.";
		
		System.out.print(season);	
		
		sc.close();
		
	}

	public void method4( ) {
		// ������ �ϳ� �Է¹޾� ����� ���� ������ ����� ����ض�
		// 90�� �̻��� A ���
		// 90�� �̸� 80�� �̻��� B ���
		// 80�� �̸� 70�� �̻��� C ���
		// 70�� �̸� 60�� �̻��� D ���
		// 60�� �̸��� F ���
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();		
			
		char ch;
		if (score >= 90) { // if�� else if �ִ�/�ּ� ����
			ch = 'A';			
		}else if ( score >= 80 ) {
			ch = 'B';
		}else if ( score >= 70 ) {
			ch = 'C';
		}else if ( score >= 60 ) {
			ch = 'D';
		}else ch = 'F';
		// ( err ) The local variable ch may not have been initialized 
		// -> ���������� ch�� ���/��� �Ϸ��� ch stack�� � ���̶� ����־���� 
		System.out.print("����� ������ "+ score + " �� �̰�, ����� "+ ch +" �Դϴ�.");
		
		sc.close();
		
		
	}

	public void method5( ) {
		// �� ��޿��� ������ ��쿡 '+' ������ �߰��� ��µ� �� �ֵ��� ����
		
		// 95 ���̻� A+
		// 85 ���̻� B+
		// 75 ���̻� C+
		// 65 ���̻� D+
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();		
			
		String grade;
		char ch;
		if (score >= 90) { // if�� else if �ִ�/�ּ� ����
			grade = "A";
			ch = 'A';
				if(score >= 95)
					grade += "+"; ch += '+';
		}else if ( score >= 80 ) {
			grade = "B"; ch = 'B';			
				if(score >= 85) {
					grade += "+";
					ch += '+';
				}
		}else if ( score >= 70 ) {
			grade = "C"; ch = 'C';
				if(score >= 75) {
					grade += "+"; 
					ch += '+';
				}
		}else if ( score >= 60 ) {
			grade = "D"; ch = 'D';
				if(score >= 65) { 
					grade += "+";ch = 'A';
					}
		}else { 
			grade = "F"; 
			ch = 'F'; 
		}
		System.out.print("����� ������ "+ score + " �� �̰�, ����� "+ grade + ch +" �Դϴ�.");
		
		sc.close();
		
		
	}

	
	
} 
