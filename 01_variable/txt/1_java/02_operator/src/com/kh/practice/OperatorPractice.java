package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : " );
		int input = sc.nextInt();
		
		String result = input >= 0 ? "�����" : "����� �ƴϴ�";
		
		System.out.print(result);
		sc.close();
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : " );
		int input = sc.nextInt();
		
		String result = input > 0 ? "�����" : (input < 0)? "������" : input == 0? "0�̴�": "";
		
		System.out.print(result);sc.close();
	}
	public void practice3() { 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : " );
		int input = sc.nextInt();
		
		String result = input %2 == 0 ? "¦����" : "Ȧ����";
		
		System.out.print(result);
		sc.close();
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� ��  : " );
		int man = sc.nextInt();
		System.out.print("���� ����  : " );
		int count = sc.nextInt();
		
		
		System.out.printf("1�δ� ���� ���� : %d", count/man);
		System.out.printf("\n���� ���� ����   : %d", count%man);sc.close();
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�  : " );
		String name = sc.nextLine();
		System.out.print("�г� (���ڸ�) : " );
		int grade = sc.nextInt();
		System.out.print("�� (���ڸ�) : " );
		int clas = sc.nextInt();
		System.out.print("��ȣ (���ڸ�) : " );
		int num = sc.nextInt();
		System.out.print("���� (M/F) : " );
		char gender = sc.next().charAt(0);
		System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ�����) : " );
		float score = sc.nextFloat();
		
		
		System.out.printf( "%d�г� %d�� %d��  %s %c�л��� ������  %.2f �̴�.",grade,clas,num,name,gender,score);sc.close();
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����  : " );
		int age = sc.nextInt();
		
		String result = age<=13 ? "���": age > 13 && age <= 19? "û�ҳ�": "����";
		
		System.out.print(result);sc.close();
	}
	
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����   : " );
		int kor = sc.nextInt();
		System.out.print("����  : " );
		int eng = sc.nextInt();
		System.out.print("����   : " );
		int math = sc.nextInt();
		
		int hap = kor + eng + math;
		double avg =  (double)hap/3.0;
		
		System.out.println(hap);
		System.out.println(avg);
		
		String result = kor >= 40 && eng >= 40 && math >= 40? avg >= 60? "�հ�" : "���հ�" :"���հ�" ;
		System.out.println(result);sc.close();
	
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ���  : " );
		char num = sc.next().charAt(7);
		//System.out.print(num );
		
		String result = num == '2' || num =='4'? "����" : num == '1'|| num == '3' ? "����": "�� �� �� ���Դϴ�.";
		System.out.println(result); 
		sc.close();
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : " );
		int num1 = sc.nextInt();
		System.out.print("����2 : " );
		int num2 = sc.nextInt();
		System.out.print("�Է� : " );
		int input = sc.nextInt();
		
		boolean tf = num1 < num2 ? input <= num1 || input > num2  ? true : false : false;
		
		System.out.print(tf);
		sc.close();
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1 : " );
		int num1 = sc.nextInt();
		System.out.print("�Է�2 : " );
		int num2 = sc.nextInt();
		System.out.print("�Է�3 : " );
		int num3 = sc.nextInt();
		
		boolean result = num1 == num2 && num2 == num3? true : false;
		System.out.print(result);
		sc.close();
	}
	
	
	public void practice11() {
		// ��� 1. ���� + (���� * �μ�Ƽ��)
		// ��� 2. ���� * (1 + �μ�Ƽ��)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A����� ���� : " );
		int Ap = sc.nextInt();
		System.out.print("B����� ���� : " );
		int Bp = sc.nextInt();
		System.out.print("C����� ���� : " );
		int Cp = sc.nextInt();
		
		
		
		double S_Ap = Ap * 0.4;
		double S_Cp = Cp * 0.15;
		
		
		double aSal = Ap *1.4;
		double cSal = Cp *1.15;
		
		String s1 = "3000 �̻�";
		String s2 = "3000 �̸�";
		
		String Aresult = Ap+S_Ap >= 3000 ? "3000 �̻�": "3000 �̸�";		
		System.out.printf("A��� ����/����+a : %d / %.1f \n %s \n",Ap, Ap+S_Ap,Aresult);
		
		System.out.println("A��� ����/����+a : "+ Ap + "/ " + aSal);
		System.out.println(aSal >= 3000? s1 : s2 );
		
		
		
		
		String Bresult = Bp >= 3000 ? "3000 �̻�": "3000 �̸�";		
		System.out.printf("B��� ����/����+a : %d / %.1f \n %s \n",Bp, (double)Bp,Bresult);
		
		System.out.println("B��� ����/����+a : "+ Bp + "/ " + (double)Bp);
		System.out.println(Bp >= 3000? s1 : s2 );
		
		
		
		
		String Cresult = Cp+S_Cp >= 3000 ? "3000 �̻�": "3000 �̸�";		
		System.out.printf("C��� ����/����+a : %d / %.13f \n %s \n",Cp, Cp+S_Cp,Cresult);
		
		System.out.println("C��� ����/����+a : "+ Cp + "/ " + cSal);
		System.out.println(cSal >= 3000? s1 : s2 );
		sc.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}