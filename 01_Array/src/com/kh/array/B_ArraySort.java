package com.kh.array;

public class B_ArraySort {
	// 5 4 1 2 3 
	// �������� : 1 2 3 4 5
	// �������� : 5 4 3 2 1 
	
	public void method1() {
		// �迭 ��ҵ� ��ġ �ٲٱ�
		int[] arr = { 2,1,3};

		// 1 2 3
//		
//		int temp = arr[0];
//		arr[0] = arr[1];
//		arr[1] = temp;
//		
		// 3 2 1 (��������)
		int temp = arr[2];
		arr[2] = arr[1];
		arr[1] = arr[0];
		arr[0] = temp;
		
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	// ��������
	
	// ��������
	
}
