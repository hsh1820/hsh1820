package com.kh.chap1.condition;

import java.util.Scanner;

public class A_If {
	
	// 단독 if 문
	/*
	 * if(조건식) {
	 * 
	 * 		수행할 코드 작성
	 * 
	 * }
	 * --> 조건식이 true 이면 블럭({}) 내 코드 수행
	 * --> 조건식 이 false 이면 블럭({}) 을 건너 뜀
	 * 
	 * */
	
	public void method1() {
		// 입력받은 정수가 양수면 "양수다"
		// 아니면, "양수가 아니다" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if (input > 0) System.out.print("양수다");
		//if (input <= 0) System.out.print("양수가 아니다");

		
		// 음수와 0이 나오도록 출력
		if (input < 0) System.out.print("음수다");
		if (input == 0) System.out.print("0이다");
		
		
	}

	public void method2( ) {
		// 입력받은 점수가 짝수인지 홀수인지 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		
		if(input % 2 == 0) {
			System.out.println("짝수다.");
		} else {
			System.out.println("홀수다.");
		}	
		
		sc.close();
		
		
	}

	public void method3( ) {
		// 입력받은 월(달)에 맞는 계절 출력하기
		// 단, 1~12 사이에 값이 아니면 
		// "해당하는 계절이 없습니다." 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월(달)을 입력해 주세요 : ");
		int month = sc.nextInt();
		
		String season;
		// 봄 3, 4, 5
		if (month >= 3 && month <= 5) {
			season = "봄";			
		}else if (month >=6 && month <= 8) {
			season = "여름";
		}else if (month >=9 && month <= 11) {
			season = "가을";
		}else if (month ==12 || month == 1 || month == 2) {
			season = "겨울";
		}else season = "해당하는 계절이 없습니다.";
		
		System.out.print(season);	
		
		sc.close();
		
	}

	public void method4( ) {
		// 점수를 하나 입력받아 등급을 나눠 점수와 등급을 출력해라
		// 90점 이상은 A 등급
		// 90점 미만 80점 이상은 B 등급
		// 80점 미만 70점 이상은 C 등급
		// 70점 미만 60점 이상은 D 등급
		// 60점 미만은 F 등급
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();		
			
		char ch;
		if (score >= 90) { // if와 else if 최대/최소 범위
			ch = 'A';			
		}else if ( score >= 80 ) {
			ch = 'B';
		}else if ( score >= 70 ) {
			ch = 'C';
		}else if ( score >= 60 ) {
			ch = 'D';
		}else ch = 'F';
		// ( err ) The local variable ch may not have been initialized 
		// -> 지역변수인 ch를 사용/출력 하려면 ch stack에 어떤 값이라도 들어있어야함 
		System.out.print("당신의 점수는 "+ score + " 점 이고, 등급은 "+ ch +" 입니다.");
		
		sc.close();
		
		
	}

	public void method5( ) {
		// 각 등급에서 다음의 경우에 '+' 구문이 추가로 출력될 수 있도록 하자
		
		// 95 점이상 A+
		// 85 점이상 B+
		// 75 점이상 C+
		// 65 점이상 D+
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();		
			
		String grade;
		char ch;
		if (score >= 90) { // if와 else if 최대/최소 범위
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
		System.out.print("당신의 점수는 "+ score + " 점 이고, 등급은 "+ grade + ch +" 입니다.");
		
		sc.close();
		
		
	}

	
	
} 

