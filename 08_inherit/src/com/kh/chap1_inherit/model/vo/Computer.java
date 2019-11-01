package com.kh.chap1_inherit.model.vo;

public class Computer extends Product{
									// -> 확장하다 
	// 부모 클래스의 멤버를 가져와서
	// 자식 클래스의 멤버에 포함시켜
	// 자식의 크기를 확장 -> 상속
	
	private int hdd;
	private int ram;
	private String cpu;
	
	public Computer() {
		super();
	}
	
	// 매개 변수 있는 생성자
	// Computer 자신의 필드 + 상속받은 피드 모두 초기화
	public Computer(int hdd, int ram, String cpu, String brand, String name, String pCode, int price) {
		super(brand, name, pCode, price);
		this.setBrand(brand);
		super.setBrand(brand);
		
		this.hdd = hdd;
		this.ram = ram;
		this.cpu = cpu;
	}
	
	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	public String inform() {
		return cpu + ", " + hdd + ", " +  ram;
	}
}
