package com.kh.chap2_ab_in.model.vo;

public interface Animal extends AnimalParent1, AnimalParent2 {
	// �������̽� ������ ����� extends ���
	// --> �������̽� ���ο� ������ ���� ���Ѿߵ� ����� �����ϹǷ�
	// �������̽��� ũ�Ⱑ Ȯ��� -> extends 

	
	// �������̽��� ���� ����� ����!
	
	
	// Ŭ������  �������̽� ��� �� implements ���
	// --> �������̽��� ������ �����϶�� ����� ����� 
	// 	   �����ؾ� �ϱ� ������ implements
	
//	public static final int LIFE = 1;
	int LIFE = 1;
	// �������̽����� �ʵ� ���� �� ��� ������ 
	// ���������� public static final 
	
	public abstract void breathing() ;
	void move();
	// �������̽����� ��� �޼ҵ�� ���������� public abstract 
	
}
