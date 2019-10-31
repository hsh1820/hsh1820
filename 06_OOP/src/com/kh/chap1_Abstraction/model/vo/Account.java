package com.kh.chap1_Abstraction.model.vo;

public class Account {
	// 클래스 구조 
	/*
	 * 클래스 선언부 {
	 * 
	 * 		// 필드 ( == 멤버 변수)
	 * 	
	 * 		// 생성자 
	 * 
	 * 		// 메소드
	 * 
	 * }
	 * 
	 * 
	 * */
	
	 // 필드
	 public String name; // 에금주
	 private String accountNumber ; //계좌번호
	 private String password;  // 비밀번호
	 public int bankCode;  // 은행코드
	 public int balance; // 잔액
	 
	// 생성자
	 public Account() {
		 
	 }
	 
	 // 메소드
	 // 입금 기능
	 public void deposit(int money) {
		 							// 입금하고자 하는 금액 전달되어 넘어옴
		 balance += money;
		 System.out.println(name + "님의 계좌에 " + money + "원이 입금됨.");
	 }
	  

}
