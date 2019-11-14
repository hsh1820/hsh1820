package com.kh.bingo.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import com.kh.bingo.controller.BingoController;

public class BingoMenu {
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.println("========== ���� ���� ==========");
		System.out.println("1. ���� ����");
		System.out.println("0. ����");
		System.out.print("�޴� ���� : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		case 1 : startBingo(); break;
		case 0 : return;
		}
	}
	
	public void startBingo() {
		//���� ũ�� �Է� ( ex. 5X5 ���� --> 5) : 5
		System.out.print("���� ũ�� �Է�  ( ex. 5X5 ���� --> 5) : ");
		int size = sc.nextInt();
		System.out.print("�¸� ��ǥ (���� ����) : ");
		int goal = sc.nextInt();
		sc.nextLine();
		
//		  18  17  15   6   8
//		  25  22  23  16  11
//		   7   5   1  10  19
//		  14  21   9   3   4
//		  24  20  13  12   2
//        ���
		BingoController bc = new BingoController();
		// sizeũ���� ������ map ���� ��������
		Map<Integer, Integer> board = new HashMap<Integer, Integer>();
		board.putAll(bc.bingoboard(size));
		
		
		// keyset, for{} / iterator�� ��������
		 
		// map,set �ȿ� iterator �� �ִ°�
		// iterator �����		
		Iterator<Integer> it = board.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.printf("%3d",board.get(key));
				System.out.println();
		}
		
//		for(Map.Entry<Integer, Integer> entry : board.entrySet()) {
//			System.out.printf("%3d",entry.getValue());
//		}
		
	}
	
}
