package com.kh.chap1_poly.controller;

import com.kh.chap1_poly.model.vo.Child1;
import com.kh.chap1_poly.model.vo.Child2;
import com.kh.chap1_poly.model.vo.Parent;

public class PolyController {
	// ������ 
	// �θ� Ŭ���� Ÿ���� ����������
	// ��� ���迡 �ִ� ���� Ÿ���� �ڽ� ��ü�� ������ �� �ִ� ���
	public void method1() {
		// 1. �θ� Ÿ�� ���۷��� ������ �θ� ��ü �ٷ��
		System.out.println("1. �θ� Ÿ�� ���۷��� ������ �θ� ��ü �ٷ��");
		
		Parent p1 = new Parent();
		// �� �θ� Ÿ�� ���۷���   �� �θ�Ÿ�� ��ü    => �θ�Ÿ������ �θ�Ÿ�� ��ü ���۷���
		p1.print();
		
		// 2. �ڽ� Ÿ�� ���۷��� ������ �ڽ� ��ü �ٷ��
		System.out.println();
		System.out.println("2. �ڽ� Ÿ�� ���۷��� ������ �ڽ� ��ü �ٷ��");
		Child1 c1 = new Child1();
		//���ڽ� Ÿ�� ���۷���     ���ڽ� Ÿ�� ��ü
		c1.printChild(); // �ڽĸ���  �޼ҵ� ���� ����
		c1.print();		 // �ڽ��� ��ӹ��� �θ� �޼ҵ� ���� ����
		System.out.println();
		
		// 3. �θ� Ÿ���� ���۷��� ������ �ڽ� ��ü �ٷ��
		System.out.println("3. �θ� Ÿ���� ���۷��� ������ �ڽ� ��ü �ٷ��");
		Parent p2 = new Child1();
		p2.print();
//		p2.printChild();
		// �θ� Ÿ�� ������ �����δ�
		// �ڽ� ��ü ��ü �� �θ� ��ü �κи� ���̹Ƿ�
		// �ڽ��� �⺣���� ������ �� ����
		
		// �ٿ� ĳ����
		// �θ� Ÿ�� ������ ������ �ڽ� ��ü�� ����� ������ �� �ֵ���
		// ������ ������ Ÿ���� �ڽ����� ���� ����ȯ �ϴ� ��
		((Child1)p2).printChild();
		// ���� �����ڰ� ����ȯ �����ں��� �켱���� ���� -> ()�� �켱���� ����
		
		System.out.println();
		// 4. �ڽ� Ÿ���� ���۷��� ������ ���� Ÿ�� ��ü �ٷ��
		System.out.println("4. �ڽ� Ÿ���� ���۷��� ������ ���� Ÿ�� ��ü �ٷ��");
//		Child2 c2 = new Child1();
		Child2 c2 = (Child2)p1; 
		// ������ ������ �߻����� ����
		// �׷��� ���� �� ����ȯ ���� ������ �߻���. (--> ��Ÿ�� ����)
		
	}
	
	
	
	
	
}
