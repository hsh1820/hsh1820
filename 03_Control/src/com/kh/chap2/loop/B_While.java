package com.kh.chap2.loop;

public class B_While {
	// 1. 단독 while문
	public void method1() {
		int i = 1; // 초기식
		
		while(i <= 10) { // 조건식
			// while문은 조건식이 true인 경우 반복을 진행함
			System.out.println(i+" 출력");
			
			i++; // 증감식
		}//System.out.println();
		
		// for문
		for(int j = 1; j<=10;j++) {
			System.out.println(j+" 출력");
		}
	}
	
	public void method2() {
		// 10 ~ 1 까지 역순 출력
		int i = 10;
		
		while(i>0) { // i>=1
			System.out.println(i + " 출력");
			i--;
		}
		
		for(int j =10 ; j>0 ; j-- )
			System.out.println(j + " 출력");
		
		
		
	}
}
