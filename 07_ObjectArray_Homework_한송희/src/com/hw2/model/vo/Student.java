package com.hw2.model.vo;

public class Student {
	private int grade ;  // �г�
	private int classroom ;  // ��
	private String name ;  // �̸�
	private int kor ;  // ��������
	private int eng ;  // ��������
	private int math ;  // ��������
	
	public Student() {
		
	}
	public Student(int grade ,int classroom ,String name ,
			int kor ,int eng ,int math ) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String information()	{
		return "";
	}
}
