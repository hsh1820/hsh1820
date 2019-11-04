package com.kh.chap1_poly.controller;

import com.kh.chap1_poly.model.vo.Computer;
import com.kh.chap1_poly.model.vo.Electronic;

public class ElectronicController {
	
	// �ʵ� 
	// 1. �θ� Ÿ�� ��ü �迭�� ���� �� �Ҵ� �Ͽ�
	// �ڽ� ��ü���� �ϰ� ���� 
	private Electronic[] elec = new Electronic[3];
	
	// ��ü �迭�� ������ �߰� �� 
	// �ε����� ���� ���ִ� ���� ����
	public static int elecIndex = 0; // �������ڸ��� �޸𸮿� 0������ �ö�
	
	
	// 2. ������ǰ ���  -- ���
	// �ܺο��� ������ ��ü�� �ּҸ� ���� �޾� 
	// �ʵ忡 �ִ� ��ü�迭�� ������� �����ϴ� �޼ҵ� ����
	public void insert(Electronic el) {
		elec[elecIndex] = el;
		elecIndex++;
	}
	
	// 3. ������ǰ ���� ��ȸ -- ���
	// ���޹��� �ε����� �ش��ϴ� �迭 ����� ������ ��� // �Ű������� �ε���
	public Electronic select (int index)	{  
		// select ȣ��� Electronic ���� ��ü�迭elec�� index��� ��ȯ 
		return elec[index]; // ��ü �ּҸ� ������ -> ��ü ���ٰ��� -> ��ȯ ���� ������ �ش� ��ü�� ���, �޼ҵ�� ��� ����		
	}
	
	// 4. ��ǰ �Ǹ� ���ɿ��� üũ
	// 
	public String sell(Electronic e) {
		if(e instanceof Computer) {
			return "ǰ��";
		}else {
			return "�ǸŰ���";
		}
	}
	
	
	
}
