package com.kh.chap1_poly.controller;

import com.kh.chap1_poly.model.vo.Child1;
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
		Child1 ch = new Child1();
		//���ڽ� Ÿ�� ���۷���     ���ڽ� Ÿ�� ��ü
		ch.printChild(); // �ڽĸ���  �޼ҵ� ���� ����
		ch.print();		 // �ڽ��� ��ӹ��� �θ� �޼ҵ� ���� ����
		System.out.println();
		
		// 3. �θ� Ÿ���� ���۷��� ������ �ڽ� ��ü �ٷ��
		System.out.println("3. �θ� Ÿ���� ���۷��� ������ �ڽ� ��ü �ٷ��");
		Parent p2 = new Child1();
		p2.print();
//		p2.printChild();
		// �θ� Ÿ�� ������ �����δ�
		// �ڽ� ��ü ��ü �� �θ� ��ü �κи� ���̹Ƿ�
		// �ڽ��� �⺣���� ������ �� ����
		
//		Child1 c2 = new Parent();
//		// err) Type mismatch: cannot convert from Parent to Child1
		
		
		
		
		
	}
}
