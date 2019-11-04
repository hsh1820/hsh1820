package com.kh.chap1_poly.view;

import com.kh.chap1_poly.controller.ElectronicController;
import com.kh.chap1_poly.model.vo.Computer;
import com.kh.chap1_poly.model.vo.Tablet;

public class ElectronicView {
	public void display() {
		// 1. ElectronicController 객체 생성
		ElectronicController ec = new ElectronicController();
		
		// 2. ElectronicController 의 insert() 메소드를 이용하여 
		// 전자제품을 객체 배열에 추가하기 
		ec.insert(new Computer("삼성", "삼성컴퓨터", 20000000, "i9=9700X", "RTX2060"));
		//  electronicController.insert().elec[0] = (   0x300   ) <-- Computer(      (Electronic()     )
		ec.insert(new Tablet("삼성", "갤럭시탭S6", 1000000, true));
		ec.insert(new Tablet("애플", "아이패드7세대", 1200000, false));
		
		
		// 3. 반복문을 이용하여 객체배열에 저장된 제품 정보 모두 출력
		for(int i =0 ; i<ElectronicController.elecIndex;i++) { // static은 클래스명으로 접근
			System.out.println(ec.select(i)/*.toString()==> 호출시 자동으로 해당 객체의 모든 내용을 문자열로 리턴 //생략가능*/);
			// elec[0] -> Computer.toString();(동적바인딩)
			// Electronic Type  
			// Elec elec[0] -->	(자식)Computer( (동적바인딩)	toString()  	(부모)Elec(	(정적바인딩)	toString()		)	) 
			// 부모 타입으로 자식을 참조 => 바인딩으로 엮어놓은 상태 
			// 실제 호출된 메소드를 어떤 것으로 호출할지 묶어놓은것 = 바인딩
			// 실행전과 실행중으로 나뉘어서 바인딩됨
			// 1) 컴파일시 자식 내부의 부모 객체의 toString으로 바인딩 (프로그램 실행전 바인딩 == 정적 바인딩)
			// 2) 실행 중 마지막으로 오버라이딩 된 메소드로 바인딩 (== 동적 바인딩)
			
		// 4. 전달받으 객체의 타입이 Computer 이면 "품절"
		// 아니면 "판매가능" 출력
			System.out.println(ec.sell(ec.select(i)));
			
			
		}
	}
}
