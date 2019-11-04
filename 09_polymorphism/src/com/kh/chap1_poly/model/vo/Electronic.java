package com.kh.chap1_poly.model.vo;

public class Electronic {
	private String brand; 
	private String name;
	private int price;
	
	// ctrl + space ---> enter
	public Electronic() {
		// TODO Auto-generated constructor stub
	}
	
	// shift + alt + s ---> o
	
	public Electronic(String brand, String name, int price) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	
	
	// shift + alt + s ---> r
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override // object 클래스에 이미 있는 메소드 이므로 override
	public String toString()	{
		return brand + ", " + name + ", " +price;
	}
}
