package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	
	// 논리 연산자
	/*
	 * 논리 값 두개를 비교하는 연산자
	 * AND (&&) : 그리고, ~면서
	 * OR  (||) : 또는 , ~거나
	 * 
	 * */
	public void method1() {


		// 입력받은 정수가 1 ~ 100 사이의 수인지 확인하기
		//int i ;
		//boolean isTrue = true;
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		input=sc.nextInt();
		
		boolean isTrue = (input >= 1) && (input <=100);
		
		System.out.println(input + "은/는 1부터 100사의 값 : " + isTrue);
		
		
		
		//		
		//		while(tf == true) {
		//			System.out.print("정수 입력 : ");
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
		// 입력받은 문자가 영어 대문자인지 확인하기
		char ch;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		ch=sc.next().charAt(0);
		
		//		int input = ch;// 자동형변환
		//		
		//		boolean isTrue = (input >= 65) && (input <= 90 );
		//		
		
		
		boolean isTrue = (ch >= 'A') && (ch <='Z');
		
		
		System.out.println(ch + "은/는 영어 대문자 : " + isTrue);
		
		
	}
	
	public void method3() {
		//입력받은 문자가 영언지 (대, 소문자 구분X) 확인하기
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = true;
		
		while(isTrue == true) {
		
		System.out.print("문자 입력 : " );
		char ch = sc.next().charAt(0);
		
		
//		int i;
//		i=ch;
//		System.out.print(i);
		
		isTrue = ((ch >='A')&&( ch <='Z')) || ((ch >='a')&&(ch <='z'));
		
		System.out.println(ch+"은/는 영어인가? : "+isTrue);
		
		}
		
		
		
		
	}

	
	


}

