package com.kh.chap1_list.part1.controller;

import com.kh.chap1_list.part1.model.vo.Student;

public class ObjectArrayController {
	// ��ü�迭 �̿��Ͽ� Student ��ü ����
	
	// �л� ��ü �迭 ����
	private Student[] arr = new Student[3];

	// ��ü�迭�� �ε��� �� ���� ����� ��� ���� ������ ����
	private int size = 0; 
	
	// ��ü �迭�� ���޹��� Student ��ü �߰� �޼ҵ�
	public void insertStudent(Student std) {
		if(size >= arr.length) {
			// ���� ũ�⺸�� �ι� ū �迭�� ���� 
			// ���� �迭 ������ ���� �� 
			// ���� ������ �迭�� �ּҸ� arr�� �����ϰ� �����
			Student[] newArr = new Student[arr.length*2];
			System.arraycopy(arr, 0, newArr, 0, arr.length);
			
			// ũ�Ⱑ ������ �迭�� �ּҸ� ���� �迭 ������ ������ �����ϰ� ����.
			arr = newArr;			
		}
		arr[size++] = std;
	}
	
	public void printStudent() {
		for(int i = 0 ;i<arr.length;i++) {
			if(arr[i] == null ) break;
			System.out.println(arr[i].toString());
		}
	}
	
	//	 �Ű������� ���޵� �ε����� �ִ� ��Ҹ� �����ϰ�
	//	 �߰��� ������ ������ ����ֱ�	
	// 	1) ������� �迭�� �ּҰ��� null
	//	ex_��ܿ� �� �ε����� �� �ε����� ��ܿͼ� �������� null
	//  
	
	// ���� ������ �迭 ��ҿ�
	// ���� �迭 ��Ҹ� ���� (�����)
	public void removeStudent(int index) {
		for(int i =index;i<arr.length-1;i++ ) {
			arr[i] = arr[i+1];
		}
		// ������ �ڸ��� null�� ����
		arr[arr.length-1] = null;
		size--;
	}
	
	
}