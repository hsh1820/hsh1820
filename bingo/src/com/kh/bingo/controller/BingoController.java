package com.kh.bingo.controller;

import java.util.HashMap;
import java.util.Map;

public class BingoController {
	
	public Map<Integer, Integer> bingoboard(int size) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		// size ��  �Է¹��� ũ��  // �Է� : 5
		int key = size*size; // Ű ���� : 25
		int value ; // 25 ũ���� �迭 
//		int flag = 0;
		// for������ Ű�� �����
		// map�� �⺻�ڷ��� ���� �Ұ�
		for(int i=0;i<key;i++) {
			// ���� �ߺ����� �ʿ�	
			value = (int)(Math.random()*100+1);// �켱�� �ִ밪 100����
//			for(int j=0; j<i;j++) {
//				flag=0;
//				if(value[i] == value[j]) {
//					flag=1;
//					break;
//				}
//			}
			
			
			// value : ���� -> int -> integer
			// key: int -> integer
			Integer.toString(i);
				// map put
				map.put(i, ((Integer)value));
		}
		return map;
	}
}
