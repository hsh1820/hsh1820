package com.kh.chap1_inherit.model.vo;

public class Computer extends Product{
									// -> Ȯ���ϴ� 
	// �θ� Ŭ������ ����� �����ͼ�
	// �ڽ� Ŭ������ ����� ���Խ���
	// �ڽ��� ũ�⸦ Ȯ�� -> ���
	
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
