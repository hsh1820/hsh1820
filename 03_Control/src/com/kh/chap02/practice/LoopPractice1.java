package com.kh.chap02.practice;

import java.util.Scanner;

public class LoopPractice1 {
	Scanner sc = new Scanner(System.in);
	public void practice1()	{
		
	System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
	int input = sc.nextInt();
	
		if (input >= 1) {
			for(int i = 1; i <= input ; i++) {
				System.out.print(i +" ");
			}
		}else System.out.print("1 �̻��� ���ڸ� �Է����ּ���.");
	}
	
	public void practice2()	{
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
			if (input >= 1) {
				for(int i = input; i > 0 ; i--) {
					System.out.print(i +" ");
				}
			}else System.out.print("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	
	public void practice3()	{
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		int hap=0;
		
			for(int i = 1; i <= input ; i++) {
				System.out.print(i);
				hap += i;
			}System.out.print(" = " + hap);
		}
	
	public void practice4()	{
		System.out.print("ù ��° ���� : ");
		int input1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int input2 = sc.nextInt();
		
		if (input1 < input2 )	{
			int swap = input1;
			input1 = input2;
			input2 = swap;
		}
		if (input1 > 0 && input2 > 0) {
			for (int i = input2; i <= input1 ; i++ ) {
				System.out.print(i + " ");
			}
		
		
		
		
		}else System.out.print("1 �̻��� ���ڸ� �Է����ּ���.");
		
		
	}
	
	public void practice5()	{
		System.out.print("���� : ");
		int num1 = sc.nextInt();
		
		for(int i = num1; i <= num1 ; i++) {
			System.out.printf("===== %d�� =====\n",num1);
			for (int j = 1; j <=9 ; j++)	{
				
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}
		
	
	}
	
	
	
	public void practice6()	{
		System.out.print("���� : ");
		int num1 = sc.nextInt();
		
		for(int i = num1; i <= 9 ; i++) {
			System.out.printf("===== %d�� =====\n",i);
			for (int j = 1; j <=9 ; j++)	{
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}
	
	}
	public void practice7()	{
		System.out.print("���� �Է� : ");
		int num1 = sc.nextInt();
		
		for(int j = 1; j <= num1; j++) {
			for(int i = 1; i <= j; i++ ) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public void practice8()	{
		System.out.print("���� �Է� : ");
			int num1 = sc.nextInt();
			
			for(int j = 1 ; j <= num1 ; j++) {
				for(int i = num1; i >= j; i--) {
					System.out.print('*');
		}System.out.println();
	}
	}
	public void practice9()	{
		System.out.print("�ڿ��� �ϳ��� �Է��ϼ���  : ");
		int num1 = sc.nextInt();
		
		if (num1 %2 ==0 && num1 % 3 ==0) {
			System.out.print();
		}
			
	
	
	
	
	}
			
			
			
}
