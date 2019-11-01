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
