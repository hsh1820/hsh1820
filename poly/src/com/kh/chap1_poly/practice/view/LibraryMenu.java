package com.kh.chap1_poly.practice.view;

import java.util.Scanner;

import com.kh.chap1_poly.practice.controller.LibraryController;
import com.kh.chap1_poly.practice.model.vo.Book;
import com.kh.chap1_poly.practice.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	
	public void mainMenu() {
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("����  : ");
		char gender = sc.next().charAt(0);
		
		Member mem = new Member(name, age, gender);
		lc.insertMember(mem);
		
		
		while(true) {
		System.out.println("==== �޴� ====");
		System.out.println("1. ����������");
		System.out.println("2. ���� ��ü ��ȸ");
		System.out.println("3. ���� �˻�");
		System.out.println("4. ���� �뿩�ϱ�");
		System.out.println("9. ���α׷� �����ϱ�");
		System.out.print("�޴� ��ȣ : ");
		
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
			System.out.println(i+"�� ���� : "+bList[i]);
//			ex ) 0������ : �������� ���� / ������ / tvN / true
		}
	}
	public void searchBook() {
		System.out.print( "�˻��� Ű���� : ");
		String keyword = sc.nextLine();
		Book[] searchList = new Book[lc.searchBook(keyword)]; 
		
	}
	public void rentBook() {
		selectAll();
		System.out.print("�뿩�� ���� ��ȣ ���� : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		if(index == 0) {
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
		}else if(index == 1) {
			System.out.println("���� �������� �뿩 �Ұ����Դϴ�.");
		}else if(index == 2) {
			System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���.");
		}
		
	}
	
}
