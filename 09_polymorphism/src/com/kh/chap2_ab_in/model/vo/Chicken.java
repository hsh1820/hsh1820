package com.kh.chap2_ab_in.model.vo;

public  class Chicken extends Bird implements Animal{

	private double crestLenght;
	
	
	public Chicken() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Chicken(int wing, double crestLenght) {
		super(wing);
		this.crestLenght = crestLenght;
	}
	

	public double getCrestLenght() {
		return crestLenght;
	}


	public void setCrestLenght(double crestLenght) {
		this.crestLenght = crestLenght;
	}


	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("날지 못함");
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
