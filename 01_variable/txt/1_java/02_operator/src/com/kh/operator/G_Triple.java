package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	// ���� ������
	
	// ���ǽ� ? ��1 : ��2;
	
	// ���ǽ� : �ݵ�� ����� true �Ǵ� false�� ������ ��
	// �� 1 : ���ǽ��� true �� �� ����Ǵ� ��
	// �� 2 : ���ǽ��� false �� �� ����Ǵ� ��
	public void method1() {
		// �Է� ���� ������ ¦���� "¦���Դϴ�."
		// Ȧ���� "Ȧ���Դϴ�." ����ϱ�
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("���� �Է� : ");
		
		int input;
		
		input = sc.nextInt();
		
		String result = ((input % 2)==0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.");
		
		System.out.print(result);
		
		
		
	
	}
	
	public void method2() {

		
		// �Է¹��� ������ ������� �������� �Ǻ��ϱ�
		boolean i = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(i == true) {
		
			System.out.print("\n���� �Է�  : ");
			
			int input = sc.nextInt();
			
			String result = (input >= 0 ? "����Դϴ�." : "�����Դϴ�.");
			
			System.out.print(result);
			if (result == "�����Դϴ�.") i = false;
		}
	}

	public void method3() {
		boolean i = true;
		
		while(i==true) {
			// �Է¹��� ������ �������, ��������, 0���� �Ǻ��ϱ�
			System.out.print("\n���� �Է� : " );
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			//���ǹ� �Ǻ��� �ʿ��� �� ����Ǽ� ������ ���� �Ǻ�
			String result = (input > 0? "���" : (input == 0 ? "0 �Դϴ�." : (input < 0 ? "����" : "null")));
			
			System.out.print(result);
			if (result == null) i = false;
		
		}
		
		
	}

	public void method4() {
		// �� ���� '+' �Ǵ� '-'�� �Է� �޾� 
		// �˸��� ��� ��� ����ϱ� 
		// ��, '+' �Ǵ� '-'�̿��� ������ �Է½� 
		// "�� �� �Է��ϼ̽��ϴ�." ����ϱ�
		
		// ex) 
		// ù ��°�� : 10
		// �� ��°�� : 5
		// ������ : +
		// ��� : 10 + 5 = 15
		
		// ex) ������ �߸� �Է� ��
				// ù ��°�� : 10
				// �� ��°�� : 5
				// ������ : +
				// ��� : �߸� �Է��ϼ̽��ϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° �� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° �� : ");
		int num2 = sc.nextInt();
		
		sc.nextLine(); // ���ۿ� �����ִ� �ٹٲ� ����(\n) ����
		
		System.out.print("������  : ");
		char op = sc.next().charAt(0);
		
		// System.out.println(num1+"/"+ num2 + "/" + op);
		
		String result = ((op == '+')? (num1 + num2 + ""):(op == '-'? (num1 - num2 + ""):"�� �� �Է��ϼ̽��ϴ�." ));
		
		System.out.println("��� : "+ result);
		
//		int total;
//		
//		String result = operator == '+')?(operator == '-';
//		System.out.print("���  : ");
		
		
		
		
	}
}
