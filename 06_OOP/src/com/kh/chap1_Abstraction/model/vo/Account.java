package com.kh.chap1_Abstraction.model.vo;

public class Account {
	// Ŭ���� ���� 
	/*
	 * Ŭ���� ����� {
	 * 
	 * 		// �ʵ� ( == ��� ����)
	 * 	
	 * 		// ������ 
	 * 
	 * 		// �޼ҵ�
	 * 
	 * }
	 * 
	 * 
	 * */
	
	 // �ʵ�
	 public String name; // ������
	 private String accountNumber ; //���¹�ȣ
	 private String password;  // ��й�ȣ
	 public int bankCode;  // �����ڵ�
	 public int balance; // �ܾ�
	 
	// ������
	 public Account() {
		 
	 }
	 
	 // �޼ҵ�
	 // �Ա� ���
	 public void deposit(int money) {
		 							// �Ա��ϰ��� �ϴ� �ݾ� ���޵Ǿ� �Ѿ��
		 balance += money;
		 System.out.println(name + "���� ���¿� " + money + "���� �Աݵ�.");
	 }
	  

}
