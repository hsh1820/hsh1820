package com.kh.array;

public class A_Array {
	
	// �迭
	// - ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��.
	// - ����� ������ �ε����� �����ȴ�.
	//   (index�� 0���� ����)
	
	public void method1() {
		// �迭�� ������� �ʰ� 
		// int �� ���� 5���� ����� ���� ���� �ʱ�ȭ �ϰ�
		// ����ϱ�
		
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
	
		// �迭 ����
		// �ڷ���[] �迭��;
		// �ڷ��� �迭��[];
		
		int[] arr;
		
		// �迭 �Ҵ�
		// - ���� ���� ������ �� �ִ� �迭���� �Ҵ�(== ����)
		// �迭�� = new �ڷ���[�迭ũ��];
		
		
		arr = new int[5];
		
		//		// ����ó�� �� �ε��� ��ҿ� ���� �Ͽ� �� ���� ����.
		//		arr[0] = 1;
		//		arr[1] = 2;
		//		arr[2] = 3;
		//		arr[3] = 4;
		//		arr[4] = 5;
				
		for(int i=0; i<arr.length;i++) {
			arr[i] = i+1;
		}
				// ����ó�� �� �迭��ҿ� �����Ͽ� ��µ� ����
				
		//		System.out.println("=== �迭 ��� ===");
		//		System.out.println(arr[0]);
		//		System.out.println(arr[1]);
		//		System.out.println(arr[2]);
		//		System.out.println(arr[3]);
		//		System.out.println(arr[4]);
		for(int i = 0; i < arr.length;i++) {
			System.out.println(arr[i]);			
		}
		
	}
	
}
