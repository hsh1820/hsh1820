package com.kh.chap1_poly.practice.controller;

import com.kh.chap1_poly.practice.model.vo.AniBook;
import com.kh.chap1_poly.practice.model.vo.Book;
import com.kh.chap1_poly.practice.model.vo.CookBook;
import com.kh.chap1_poly.practice.model.vo.Member;

public class LibraryController {
	private Member mem = new Member();
	private Book[] bList = new Book[5];
	
	
	{ // 초기화 블록
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
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
