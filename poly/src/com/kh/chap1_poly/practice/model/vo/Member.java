package com.kh.chap1_poly.practice.model.vo;

public class Member {
	private String name;
	private int age;
	private char gender;
	private int couponCount = 0;
	
	public Member() {
		
	}

	public Member(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	public String toString()	{
		return "";
	}
	
	
	
}