package com.kh.practice2;

import java.util.Scanner;

public class CastingPractice1 {
	public void practice1(){
		while(true) {
//		키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요.
//		ex.
//		문자 : A
//		A unicode : 65
			char a;			
			boolean tf=true;
			
				while(tf==true) {
					Scanner sc = new Scanner(System.in);
					System.out.print("문자 : ");
					a=sc.nextLine().charAt(0);				
					// 자동형변환
					int i = a;		
					//System.out.printf("%c unicode : %d\n",a,i);
					
					// 강제형변환
					// 값의 범위가 큰 -> 작 강제로 변환
					// * 응용 * 작은 범위 -> 큰 범위로 강제 변경 가능.
					System.out.printf("%c unicode : %d\n",a,(int)a);
					
					System.out.print("숫자 입력 : ");		
					i = sc.nextInt();		
					System.out.printf("%d 문자 : %c\n",i,(char)i);
					
					tf =false;
				}
			}
		}
	}


