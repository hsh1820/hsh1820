package com.kh.array;

import java.util.Scanner;

public class A_Array {
	Scanner sc =new Scanner(System.in);
	// 배열
	// - 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	// - 저장된 값마다 인덱스가 지정된다.
	//   (index는 0부터 시작)
	
	public void method1() {
		// 배열을 사용하지 않고 
		// int 형 변수 5개를 만들어 각각 값을 초기화 하고
		// 출력하기
		
		//		int num1 =1;
		//		int num2 =2;
		//		int num3 =3;
		//		int num4 =4;
		//		int num5 =5;
		//		
		//		System.out.println(num1);
		//		System.out.println(num2);
		//		System.out.println(num3);
		//		System.out.println(num4);
		//		System.out.println(num5);
	
		// 배열 선언
		// 자료형[] 배열명;
		// 자료형 배열명[];
		
		int[] arr;
		
		// 배열 할당
		// - 실제 값을 저장할 수 있는 배열공간 할당(== 생성)
		// 배열명 = new 자료형[배열크기];
		
		
		arr = new int[5];
		
		//		// 변수처럼 각 인덱스 요소에 접근 하여 값 저장 가능.
		//		arr[0] = 1;
		//		arr[1] = 2;
		//		arr[2] = 3;
		//		arr[3] = 4;
		//		arr[4] = 5;
				
		for(int i=0; i<arr.length;i++) {
			arr[i] = i+1;
		}
				// 변수처럼 각 배열요소에 접근하여 출력도 가능
				
		//		System.out.println("=== 배열 출력 ===");
		//		System.out.println(arr[0]);
		//		System.out.println(arr[1]);
		//		System.out.println(arr[2]);
		//		System.out.println(arr[3]);
		//		System.out.println(arr[4]);
		for(int i = 0; i < arr.length;i++) {
			System.out.println(arr[i]);			
		}
		System.out.println(arr);
	}
	
	public void method2() {
		// 사용자가 지정한 크기만큼의 배열을 할당하고
		// 그 배열에 1부터 지정한 크기만큼의 숫자를 저장 및 출력
		System.out.print("할당할 크기 : ");
		int size = sc.nextInt();
		
		// 입력받은 크기만큼의 배열 선언 및 할당
		int[] arr = new int[size];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = i+1;
			System.out.println(arr[i]);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
