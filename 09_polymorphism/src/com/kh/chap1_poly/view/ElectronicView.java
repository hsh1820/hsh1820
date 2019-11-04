package com.kh.chap1_poly.view;

import com.kh.chap1_poly.controller.ElectronicController;
import com.kh.chap1_poly.model.vo.Computer;
import com.kh.chap1_poly.model.vo.Tablet;

public class ElectronicView {
	public void display() {
		// 1. ElectronicController ��ü ����
		ElectronicController ec = new ElectronicController();
		
		// 2. ElectronicController �� insert() �޼ҵ带 �̿��Ͽ� 
		// ������ǰ�� ��ü �迭�� �߰��ϱ� 
		ec.insert(new Computer("�Ｚ", "�Ｚ��ǻ��", 20000000, "i9=9700X", "RTX2060"));
		//  electronicController.insert().elec[0] = (   0x300   ) <-- Computer(      (Electronic()     )
		ec.insert(new Tablet("�Ｚ", "��������S6", 1000000, true));
		ec.insert(new Tablet("����", "�����е�7����", 1200000, false));
		
		
		// 3. �ݺ����� �̿��Ͽ� ��ü�迭�� ����� ��ǰ ���� ��� ���
		for(int i =0 ; i<ElectronicController.elecIndex;i++) { // static�� Ŭ���������� ����
			System.out.println(ec.select(i)/*.toString()==> ȣ��� �ڵ����� �ش� ��ü�� ��� ������ ���ڿ��� ���� //��������*/);
			// elec[0] -> Computer.toString();(�������ε�)
			// Electronic Type  
			// Elec elec[0] -->	(�ڽ�)Computer( (�������ε�)	toString()  	(�θ�)Elec(	(�������ε�)	toString()		)	) 
			// �θ� Ÿ������ �ڽ��� ���� => ���ε����� ������� ���� 
			// ���� ȣ��� �޼ҵ带 � ������ ȣ������ ��������� = ���ε�
			// �������� ���������� ����� ���ε���
			// 1) �����Ͻ� �ڽ� ������ �θ� ��ü�� toString���� ���ε� (���α׷� ������ ���ε� == ���� ���ε�)
			// 2) ���� �� ���������� �������̵� �� �޼ҵ�� ���ε� (== ���� ���ε�)
			
		// 4. ���޹��� ��ü�� Ÿ���� Computer �̸� "ǰ��"
		// �ƴϸ� "�ǸŰ���" ���
			System.out.println(ec.sell(ec.select(i)));
			
			
		}
	}
}
