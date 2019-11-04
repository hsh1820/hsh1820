package com.kh.chap1_poly.controller;

import com.kh.chap1_poly.model.vo.Computer;
import com.kh.chap1_poly.model.vo.Electronic;

public class ElectronicController {
	
	// 필드 
	// 1. 부모 타입 객체 배열을 선언 및 할당 하여
	// 자식 객체들을 일괄 관리 
	private Electronic[] elec = new Electronic[3];
	
	// 객체 배열에 데이터 추가 시 
	// 인덱스를 관리 해주는 변수 선언
	public static int elecIndex = 0; // 시작하자마자 메모리에 0값으로 올라감
	
	
	// 2. 전자제품 등록  -- 기능
	// 외부에서 생성된 객체의 주소를 전달 받아 
	// 필드에 있는 객체배열에 순서대로 저장하는 메소드 생성
	public void insert(Electronic el) {
		elec[elecIndex] = el;
		elecIndex++;
	}
	
	// 3. 전자제품 정보 조회 -- 기능
	// 전달받은 인덱스에 해당하는 배열 요소의 정보를 출력 // 매개변수로 인덱스
	public Electronic select (int index)	{  
		// select 호출시 Electronic 형의 객체배열elec의 index요소 반환 
		return elec[index]; // 객체 주소를 내보냄 -> 객체 접근가능 -> 반환 받은 곳에서 해당 객체의 멤버, 메소드들 사용 가능		
	}
	
	// 4. 상품 판매 가능여부 체크
	// 
	public String sell(Electronic e) {
		if(e instanceof Computer) {
			return "품절";
		}else {
			return "판매가능";
		}
	}
	
	
	
}
