package com.hw2.model.vo;

public class Student {
	private int grade ;  // 학년
	private int classroom ;  // 반
	private String name ;  // 이름
	private int kor ;  // 국어점수
	private int eng ;  // 영어점수
	private int math ;  // 수학점수
	
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
