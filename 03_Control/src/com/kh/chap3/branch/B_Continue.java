package com.kh.chap3.branch;

import java.util.Scanner;

public class B_Continue {
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// 1 ���� 100 ������ ���� ��
		// 4�� ����� ������ ������ �� ���ϱ�

		int sum = 0;
		
		for(int i = 1; i<=100;i++) {
			
			if(i % 4 ==0) {
				continue;
			}
			sum += i;
		}
		System.out.println("�հ� : " + sum);
	}
	
	public void method2() {
		// 2~9 �� ������ �� Ȧ���ܸ� ����ϱ�
		
	}
}

