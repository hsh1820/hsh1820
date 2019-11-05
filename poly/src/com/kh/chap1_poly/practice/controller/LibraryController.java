package com.kh.chap1_poly.practice.controller;

import com.kh.chap1_poly.practice.model.vo.AniBook;
import com.kh.chap1_poly.practice.model.vo.Book;
import com.kh.chap1_poly.practice.model.vo.CookBook;
import com.kh.chap1_poly.practice.model.vo.Member;

public class LibraryController {
	private Member mem = new Member();
	private Book[] bList = new Book[5];
	
	
	{ // �ʱ�ȭ ���
		bList[0] = new CookBook("�������� ����", "������", "tvN", true);
		bList[1] = new AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19);
		bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true);
	}
	
	
	
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	public Member myInfo() {
		
		return mem;
		
	}
	
	public Book[] selectAll() {
		return bList;
		
	}
	
	public Book[] searchBook(String keyword) {
		
		Book[] searchList = new Book[5];
		
		int index = 0;
		for(int i =0;i<bList.length;i++) {
			
			if(bList[i].getTitle().contains(keyword)) {
				searchList[index++] = bList[i];
			}
		}
		return searchList;
		
	}
	
	public int rentBook(int index)	{
		
		int result = 0;
		
		if(bList[index] ) {
			
		}
		
		return index;
	}
	
}
