package com.kh.bingo.controller;

import java.util.HashMap;
import java.util.Map;

public class BingoController {
	
	public Map<Integer, Integer> bingoboard(int size) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		// size 는  입력받은 크기  // 입력 : 5
		int key = size*size; // 키 갯수 : 25
		int value ; // 25 크기의 배열 
//		int flag = 0;
		// for문으로 키값 만들기
		// map은 기본자료형 저장 불가
		for(int i=0;i<key;i++) {
			// 난수 중복제거 필요	
			value = (int)(Math.random()*100+1);// 우선은 최대값 100까지
//			for(int j=0; j<i;j++) {
//				flag=0;
//				if(value[i] == value[j]) {
//					flag=1;
//					break;
//				}
//			}
			
			
			// value : 난수 -> int -> integer
			// key: int -> integer
			Integer.toString(i);
				// map put
				map.put(i, ((Integer)value));
		}
		return map;
	}
}
