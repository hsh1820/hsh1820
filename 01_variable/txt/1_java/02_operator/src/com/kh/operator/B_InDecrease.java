package com.kh.operator;

public class B_InDecrease {

	// ���� ������
	// �ǿ������� ���� 1�� ���ϰų� ���� ������
	
	// ����, ���� �����ڷ� ����
	
	public void method1() {
		// ���� ������ : ���� ���� �� �ٸ� ���� ����
		int a = 10;
		int b = ++a;
		System.out.println(a + ", " + b);
		
		// ���� ������ : �ٸ� ���� �켱 ���� �� ���� ���� 
		int a2 = 10;
		int b2 = a2++/(a2+a2++)+a2;
		System.out.println(a2 + ", " + b2); // a2 == 11 , b2 == 10
	
		}
	public void method2() {
		int iNum = 10;
		
		System.out.println("���� ���� �� : "+ iNum );
		
		System.out.println("++iNum 1ȸ ���� : " + ++iNum); // 11 
		System.out.println("++iNum 2ȸ ���� : " + ++iNum); // 12 
		System.out.println("++iNum 3ȸ ���� : " + ++iNum); // 13 
		System.out.println("++iNum 4ȸ ���� : " + ++iNum); // 14 
		System.out.println("++iNum 5ȸ ���� : " + ++iNum); // 15
		
		System.out.println("���� iNum �� : "+ iNum );
		
		
		System.out.println(); // �ٹٲ�
		System.out.println(); // �ٹٲ�
		System.out.println(); // �ٹٲ�
		
		// ���� ���� ������ �׽�Ʈ
		int iNum2 = 10;
		
		System.out.println("���� ���� �� : " + iNum2);
		
		System.out.println("iNum-- 1ȸ ���� : "+ iNum2--); //10
		System.out.println("iNum-- 2ȸ ���� : "+ iNum2--); //9
		System.out.println("iNum-- 3ȸ ���� : "+ iNum2--); //8
		System.out.println("iNum-- 4ȸ ���� : "+ iNum2--); //7
		System.out.println("iNum-- 5ȸ ���� : "+ iNum2--); //6
		
		System.out.println("���� iNum2 �� : "+ iNum2 ); //5
		
		}
	public void method3() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++);//10=>11
		System.out.println(++a + b++);//12 20+1 30
		System.out.println(a++ + --b + --c);//12->13 + 20 + 29
		System.out.println(--b - a++ + ++c);// 19 - 13->12 + 30=36
		
		System.out.println("a == " + a);
		System.out.println("b == " + b);
		System.out.println("c == " + c);
		
	}
	
}