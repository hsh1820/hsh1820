package com.kh.chap1_poly.practice.view;

import java.util.Scanner;

import com.kh.chap1_poly.practice.controller.LibraryController;
import com.kh.chap1_poly.practice.model.vo.Book;
import com.kh.chap1_poly.practice.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	
	public void mainMenu() {
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별  : ");
		char gender = sc.next().charAt(0);
		
		Member mem = new Member(name, age, gender);
		lc.insertMember(mem);
		
		
		while(true) {
		System.out.println("==== 메뉴 ====");
		System.out.println("1. 마이페이지");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색");
		System.out.println("4. 도서 대여하기");
		System.out.println("9. 프로그램 종료하기");
		System.out.print("메뉴 번호 : ");
		
		int menu = sc.nextInt();
		switch(menu) {
			case 1 : {
				lc.myInfo();
				break;
			}
			case 2: {
				lc.selectAll();
				break;
			}
			case 3:{
				lc.searchBook(keyword);
				break;
			}
			case 4: {
				lc.rentBook(index);
				break;
			}
			case 9 : {
				return;
			}
				
		}
	}
}
	public void selectAll() {
		Book[] bList = new Book[lc.selectAll()];
		for(int i=0;i<bList.length;i++) {
			System.out.println(i+"번 도서 : "+bList[i]);
//			ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
		}
	}
	public void searchBook() {
		System.out.print( "검색할 키워드 : ");
		String keyword = sc.nextLine();
		Book[] searchList = new Book[lc.searchBook(keyword)]; 
		
	}
	public void rentBook() {
		selectAll();
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		if(index == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		}else if(index == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		}else if(index == 2) {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		}
		
	}
	
}
