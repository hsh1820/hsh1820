package com.kh.operator;

import java.util.Scanner;

public class C_Arithmetic {
	// ��� ������
	// �⺻���� ��Ģ���� (+ - * / ) + % (������) 5������ ����
	// [* / %] �� �켱������ ����
	
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� �Է�: ");
		int num2 = sc.nextInt();
		
		System.out.println("num1 + num2 = " + (num1+num2));//30
		System.out.println("num1 - num2 = " + (num1-num2));//-20
		System.out.println("num1 * num2 = " + (num1*num2));//600
		System.out.println("num1 / num2 = " + (num1/num2));//3
		System.out.println("num1 % num2 = " + (num1%num2));//0
		
		
	}
	public void method2() {
		// % �� �ַ� ����ϴ� ���
		// --> � ���� ��������� Ȯ���ϴ� ��쿡 �ַ� ����.
		
		// 2�� ������� �ƴ��� Ȯ�� -> ¦�� Ȧ�� ����
		// 10 % 2 == 0 
		// 9 % 2 == 1 
		System.out.println("10 % 2 = " + (10 % 2));
		System.out.println("9 % 2 = " + (9 % 2));
		
		// 5�� ������� Ȯ��
		System.out.println("54865 % 5 = "+(54865 % 5));
		
		
	}
	
	public void method3() {
		// ��� ������ + ���� ������
		
		int a = 5;
		int b = 10;
		
		int c = (++a) + b;//5->6 + 10 = 16 
		
		int d = c / a; // 16 / 6 = 2
		
		int e = c % a; // 4
		
		int f = e++; //f 4 -> e 5
		
		int g = (--b) + (d--);//9+2->1 = 11
		
		int h = 2;
		
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);  
		// 6 + 9 /(15/4)*(11-1)%(6+2)
		// 6+ 9 / 3 *10%8
		// 6+3*10%8
		// 6+30%8
		// 6+6
		// 12
		
		System.out.println("a  : " +a); 
		System.out.println("b  : " +b); 
		System.out.println("c  : " +c); 
		System.out.println("d  : " +d); 
		System.out.println("e  : " +e); 
		System.out.println("f  : " +f); 
		System.out.println("g  : " +g); 
		System.out.println("h  : " +h); 
		System.out.println("i  : " +i);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}