package com.kh.array;

import java.util.Arrays;

public class C_ArrayCopy {
	
	// 배열 복사 
	// - 얕은 복사 : 배열의 주소만을 복사
	// - 깊은 복사 : 복사하려는 배열과 동일한 크기의 
	// 					새로운 배열을 만들어 실제 내부 값을 모두 복사하는 것 
	
	public void method1() {
		int[]  origin = {1,2,3,4,5};
		
		// 얕은 복사
		int[] copyArr = origin;
		
		
		System.out.println("변경 전 ");
		System.out.println("origin : " + Arrays.toString(origin));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		System.out.println();
		// 주소값이 같은지 확인
		System.out.println("origin 의 hashCode :  " +  origin.hashCode());
		System.out.println("copyArr 의 hashCode :  " +  copyArr.hashCode());
		
		System.out.println();
		System.out.println("변경 후 ");
		
		copyArr[0] = 99;// 앝은 복사한 변수를 이용하여 0번 인덱스 값 변경 
		
		// origin(원본) 데이터의 변형이 있는지 확인
		System.out.println("origin : " + Arrays.toString(origin));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		System.out.println();
		// 주소값이 같은지 확인
		System.out.println("origin 의 hashCode :  " +  origin.hashCode());
		System.out.println("copyArr 의 hashCode :  " +  copyArr.hashCode());
	}
	
	
	public void method2() {
		
		int[] origin = {1,2,3,4,5};
		
		// 깊은 복사
		// --> 깊은 복사를 하기 위해서는 "최소" 원본과 같은 크기의 배열이 필요함
		int[] copyArr = new int[origin.length];
		
//		System.out.println(copyArr.toString());
		
		for(int i =0; i<origin.length;i++) {
			// 원본 배열의 데이터를 깊은 복사한 배열에 복사
			copyArr[i] = origin[i];  
		}
		System.out.println("변경 전 ");
		System.out.println("origin : " + Arrays.toString(origin));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		System.out.println();
		// 주소값이 다른지 확인
		System.out.println("origin 의 hashCode :  " +  origin.hashCode());
		System.out.println("copyArr 의 hashCode :  " +  copyArr.hashCode());
		
		System.out.println();

		System.out.println("변경 후 ");

		copyArr[0] = 99;// 앝은 복사한 변수를 이용하여 0번 인덱스 값 변경 
		
		// origin(원본) 데이터의 변형이 있는지 확인
		System.out.println("origin : " + Arrays.toString(origin));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		System.out.println();
		// 주소값이 같은지 확인
		System.out.println("origin 의 hashCode :  " +  origin.hashCode());
		System.out.println("copyArr 의 hashCode :  " +  copyArr.hashCode());
		
		
	}
	
	
	public void method3() {
		
		// system 클래스에서 제공하는 arraycopy() 메소드를 사용하여 깊은 복사 하기
		
		int[]	origin = { 9,8,7,6,5};
		
		// 복사할 배열 선언 및 할당
		int[] copyArr = new int[origin.length];
		
		// system.arraycopy(원본배열명, 원본배열의 복사가 시작될 인덱스, 
		// 복사본 배열명, 복사본에 원본데이터의 복사를 시작할 인덱스, 원본에서 복사해올 데이터 길이); 
		
		System.arraycopy(origin, 0, copyArr, 0, origin.length); 
		
		System.out.println("origin : " + Arrays.toString(origin));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
