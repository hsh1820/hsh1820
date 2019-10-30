package com.kh.array;

import java.util.Arrays;

public class C_ArrayCopy {
	
	// �迭 ���� 
	// - ���� ���� : �迭�� �ּҸ��� ����
	// - ���� ���� : �����Ϸ��� �迭�� ������ ũ���� 
	// 					���ο� �迭�� ����� ���� ���� ���� ��� �����ϴ� �� 
	
	public void method1() {
		int[]  origin = {1,2,3,4,5};
		
		// ���� ����
		int[] copyArr = origin;
		
		
		System.out.println("���� �� ");
		System.out.println("origin : " + Arrays.toString(origin));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		System.out.println();
		// �ּҰ��� ������ Ȯ��
		System.out.println("origin �� hashCode :  " +  origin.hashCode());
		System.out.println("copyArr �� hashCode :  " +  copyArr.hashCode());
		
		System.out.println();
		System.out.println("���� �� ");
		
		copyArr[0] = 99;// ���� ������ ������ �̿��Ͽ� 0�� �ε��� �� ���� 
		
		// origin(����) �������� ������ �ִ��� Ȯ��
		System.out.println("origin : " + Arrays.toString(origin));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		System.out.println();
		// �ּҰ��� ������ Ȯ��
		System.out.println("origin �� hashCode :  " +  origin.hashCode());
		System.out.println("copyArr �� hashCode :  " +  copyArr.hashCode());
	}
	
	
	public void method2() {
		
		int[] origin = {1,2,3,4,5};
		
		// ���� ����
		// --> ���� ���縦 �ϱ� ���ؼ��� "�ּ�" ������ ���� ũ���� �迭�� �ʿ���
		int[] copyArr = new int[origin.length];
		
//		System.out.println(copyArr.toString());
		
		for(int i =0; i<origin.length;i++) {
			// ���� �迭�� �����͸� ���� ������ �迭�� ����
			copyArr[i] = origin[i];  
		}
		System.out.println("���� �� ");
		System.out.println("origin : " + Arrays.toString(origin));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		System.out.println();
		// �ּҰ��� �ٸ��� Ȯ��
		System.out.println("origin �� hashCode :  " +  origin.hashCode());
		System.out.println("copyArr �� hashCode :  " +  copyArr.hashCode());
		
		System.out.println();

		System.out.println("���� �� ");

		copyArr[0] = 99;// ���� ������ ������ �̿��Ͽ� 0�� �ε��� �� ���� 
		
		// origin(����) �������� ������ �ִ��� Ȯ��
		System.out.println("origin : " + Arrays.toString(origin));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		System.out.println();
		// �ּҰ��� ������ Ȯ��
		System.out.println("origin �� hashCode :  " +  origin.hashCode());
		System.out.println("copyArr �� hashCode :  " +  copyArr.hashCode());
		
		
	}
	
	
	public void method3() {
		
		// system Ŭ�������� �����ϴ� arraycopy() �޼ҵ带 ����Ͽ� ���� ���� �ϱ�
		
		int[]	origin = { 9,8,7,6,5};
		
		// ������ �迭 ���� �� �Ҵ�
		int[] copyArr = new int[origin.length];
		
		// system.arraycopy(�����迭��, �����迭�� ���簡 ���۵� �ε���, 
		// ���纻 �迭��, ���纻�� ������������ ���縦 ������ �ε���, �������� �����ؿ� ������ ����); 
		
		System.arraycopy(origin, 0, copyArr, 0, origin.length); 
		
		System.out.println("origin : " + Arrays.toString(origin));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
