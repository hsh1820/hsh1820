package com.kh.chap2.loop;

public class B_While {
	// 1. �ܵ� while��
	public void method1() {
		int i = 1; // �ʱ��
		
		while(i <= 10) { // ���ǽ�
			// while���� ���ǽ��� true�� ��� �ݺ��� ������
			System.out.println(i+" ���");
			
			i++; // ������
		}//System.out.println();
		
		// for��
		for(int j = 1; j<=10;j++) {
			System.out.println(j+" ���");
		}
	}
	
	public void method2() {
		// 10 ~ 1 ���� ���� ���
		int i = 10;
		
		while(i>0) { // i>=1
			System.out.println(i + " ���");
			i--;
		}
		
		for(int j =10 ; j>0 ; j-- )
			System.out.println(j + " ���");
		
		
		
	}
}
