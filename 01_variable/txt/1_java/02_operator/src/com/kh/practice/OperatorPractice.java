package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : " );
		int input = sc.nextInt();
		
		String result = input >= 0 ? "양수다" : "양수가 아니다";
		
		System.out.print(result);
		sc.close();
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : " );
		int input = sc.nextInt();
		
		String result = input > 0 ? "양수다" : (input < 0)? "음수다" : input == 0? "0이다": "";
		
		System.out.print(result);sc.close();
	}
	public void practice3() { 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : " );
		int input = sc.nextInt();
		
		String result = input %2 == 0 ? "짝수다" : "홀수다";
		
		System.out.print(result);
		sc.close();
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수  : " );
		int man = sc.nextInt();
		System.out.print("사탕 개수  : " );
		int count = sc.nextInt();
		
		
		System.out.printf("1인당 사탕 개수 : %d", count/man);
		System.out.printf("\n남은 사탕 개수   : %d", count%man);sc.close();
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름  : " );
		String name = sc.nextLine();
		System.out.print("학년 (숫자만) : " );
		int grade = sc.nextInt();
		System.out.print("반 (숫자만) : " );
		int clas = sc.nextInt();
		System.out.print("번호 (숫자만) : " );
		int num = sc.nextInt();
		System.out.print("성별 (M/F) : " );
		char gender = sc.next().charAt(0);
		System.out.print("성적(소수점 아래 둘째 자리까지) : " );
		float score = sc.nextFloat();
		
		
		System.out.printf( "%d학년 %d반 %d번  %s %c학생의 성적은  %.2f 이다.",grade,clas,num,name,gender,score);sc.close();
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이  : " );
		int age = sc.nextInt();
		
		String result = age<=13 ? "어린이": age > 13 && age <= 19? "청소년": "성인";
		
		System.out.print(result);sc.close();
	}
	
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어   : " );
		int kor = sc.nextInt();
		System.out.print("영어  : " );
		int eng = sc.nextInt();
		System.out.print("수학   : " );
		int math = sc.nextInt();
		
		int hap = kor + eng + math;
		double avg =  (double)hap/3.0;
		
		System.out.println(hap);
		System.out.println(avg);
		
		String result = kor >= 40 && eng >= 40 && math >= 40? avg >= 60? "합격" : "불합격" :"불합격" ;
		System.out.println(result);sc.close();
	
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요  : " );
		char num = sc.next().charAt(7);
		//System.out.print(num );
		
		String result = num == '2' || num =='4'? "여자" : num == '1'|| num == '3' ? "남자": "잘 못 된 값입니다.";
		System.out.println(result); 
		sc.close();
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : " );
		int num1 = sc.nextInt();
		System.out.print("정수2 : " );
		int num2 = sc.nextInt();
		System.out.print("입력 : " );
		int input = sc.nextInt();
		
		boolean tf = num1 < num2 ? input <= num1 || input > num2  ? true : false : false;
		
		System.out.print(tf);
		sc.close();
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : " );
		int num1 = sc.nextInt();
		System.out.print("입력2 : " );
		int num2 = sc.nextInt();
		System.out.print("입력3 : " );
		int num3 = sc.nextInt();
		
		boolean result = num1 == num2 && num2 == num3? true : false;
		System.out.print(result);
		sc.close();
	}
	
	
	public void practice11() {
		// 방법 1. 연봉 + (연봉 * 인센티브)
		// 방법 2. 연봉 * (1 + 인센티브)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : " );
		int Ap = sc.nextInt();
		System.out.print("B사원의 연봉 : " );
		int Bp = sc.nextInt();
		System.out.print("C사원의 연봉 : " );
		int Cp = sc.nextInt();
		
		
		
		double S_Ap = Ap * 0.4;
		double S_Cp = Cp * 0.15;
		
		
		double aSal = Ap *1.4;
		double cSal = Cp *1.15;
		
		String s1 = "3000 이상";
		String s2 = "3000 미만";
		
		String Aresult = Ap+S_Ap >= 3000 ? "3000 이상": "3000 미만";		
		System.out.printf("A사원 연봉/연봉+a : %d / %.1f \n %s \n",Ap, Ap+S_Ap,Aresult);
		
		System.out.println("A사원 연봉/연봉+a : "+ Ap + "/ " + aSal);
		System.out.println(aSal >= 3000? s1 : s2 );
		
		
		
		
		String Bresult = Bp >= 3000 ? "3000 이상": "3000 미만";		
		System.out.printf("B사원 연봉/연봉+a : %d / %.1f \n %s \n",Bp, (double)Bp,Bresult);
		
		System.out.println("B사원 연봉/연봉+a : "+ Bp + "/ " + (double)Bp);
		System.out.println(Bp >= 3000? s1 : s2 );
		
		
		
		
		String Cresult = Cp+S_Cp >= 3000 ? "3000 이상": "3000 미만";		
		System.out.printf("C사원 연봉/연봉+a : %d / %.13f \n %s \n",Cp, Cp+S_Cp,Cresult);
		
		System.out.println("C사원 연봉/연봉+a : "+ Cp + "/ " + cSal);
		System.out.println(cSal >= 3000? s1 : s2 );
		sc.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
