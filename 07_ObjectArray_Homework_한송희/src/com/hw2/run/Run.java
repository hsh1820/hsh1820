package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {
public static void main(String[] args) {
	Student[] st = new Student[10];
	Scanner sc = new Scanner(System.in);
	int count = 0;
	
	while(true)	{
		System.out.print("�г� : ");
		st[count].setGrade(sc.nextInt());
		System.out.print("�� : ");
		st[count].setClassroom(sc.nextInt());
		sc.nextLine();
		System.out.print("�̸� : ");
		st[count].setName(sc.nextLine());
		System.out.print("�������� : ");
		st[count].setKor(sc.nextInt());
		System.out.print("�������� : ");
		st[count].setEng(sc.nextInt());
		System.out.print("�������� : ");
		st[count].setMath(sc.nextInt());
		sc.nextLine();
		
		count++;
		System.out.print("�߰��Ͻðڽ��ϱ�? (Y/N) : ");
		}
	}
}
