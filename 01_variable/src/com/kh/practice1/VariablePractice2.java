package com.kh.practice1;

import java.util.Scanner;

public class VariablePractice2 {
	public void practice1() {
	//		키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
	//		ex.
	//		첫 번째 정수 : 23
	//		두 번째 정수 : 7
	//		더하기 결과 : 30
	//		빼기 결과 : 16
	//		곱하기 결과 : 161
	//		나누기 몫 결과 : 3
		
		int a ;
		int b ;
		
		int plus;
		int min;
		int mul;
		int div;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번쨰 정수 : ");
		a=sc.nextInt();
				
		System.out.print("두 번쨰 정수 : ");
		b=sc.nextInt();
		
		System.out.print("더하기 결과 : "+(a+b)+"\n");
		System.out.print("빼기 결과 : "+(a-b)+"\n");
		System.out.print("곱하기 결과 : "+(a*b)+"\n");
		System.out.print("나누기 몫 결과 : "+(a/b)+"\n");sc.close();
	}
}
