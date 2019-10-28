package com.kh.variable;

public class A_Variable {
	 
	// ������ ������� �ʴ� ���
	public void noVariable() {
		System.out.println("========== ���� ��� X ==========");
		System.out.println(2 * 3.14159265389793 * 5);
		System.out.println(3.14159265389793 * 5 * 5 );
		System.out.println(3.14159265389793 * 5 * 5 * 20 );
		System.out.println(4 * 3.14159265389793 * 5 * 5 );
	}
	// ������ ����� ���
	public void usingVariable() {
		double pi = 3.14159265389793; // ������
		int r = 5; // ������
		int h = 20; // ����
		
		System.out.println("=========== ������� O ==========");
		System.out.println( 2 * pi * r ); // ���� �ѷ�
		System.out.println( pi * r * r ); // ���� ����
		System.out.println( pi * r * r * h ); // ����� ����
		System.out.println( 4 * pi * r * r ); // ���� �ѳ���
				
		
	}
	
	
	
	
	
	
	// ���� ����
	public void declareVariable() {
		// 1. ������
		boolean isTrue; // 1byte -> true / false
				
		// 2. ������
		byte bNum; // 1byte == 8bit == 2^8
		short sNum; // 2byte == 16bnit == 2^16
		int iNum; // 4byte -> ������ �⺻ �ڷ���
		long lNum; // 8byte 
				
		// 3. �Ǽ��� -> �ε��Ҽ������
		float fNum; // 4byte
		double dNum; // 8byte -> �Ǽ��� �⺻ �ڷ���
		
		// 4. ������
		char ch; // 2byte �����ڵ�
		//���� ����Ǵ� ���� ��������, ��Ī�Ǵ� ���ڰ� ��µ�
		
		// 5. ���ڿ�(������)
		String str; // 4byte -> �����Ǵ� �ּҰ�(����)�� �����ϱ⶧��
		
		
		//		int 1num;
		//		int ����;
		
		
		// ������ �� ����
		isTrue = true;
		// �������� ���ͷ��� true / false �ۿ� ����
		
		// ������ �� ����
		iNum = 100; // �Ϲ� ������ int�� ���ͷ� ǥ����
				
		lNum = 200L;
		// long�� ���ͷ��� ���� �ڿ� l, L �� ����
		
		bNum = 127;		
		sNum = 32767;
		// byte, short �ڷ����� ���� �ڵ���� ȣȯ�� ���� ��������
		// --> ���� ���ͷ� ǥ������ ��� intǥ������ ���� ���
		 
		// �Ǽ��� �� ����
		fNum = 1.1234567f; 
		// float�� ���ͷ��� �Ǽ� �ڿ� f �Ǵ� F ǥ��
		// float�� �Ҽ��� �Ʒ� 8��° �ڸ����� �ݿø���.
		
		dNum = 1.123456789012345; 
		// double�� �Ҽ��� �Ʒ� 16��° �ڸ����� �ݿø���.
		// �Ϲ� �Ǽ��� double�� ���ͷ�
		
		
		// ������ �� ����
		ch = 'A'; 
//		ch = '��';
//		ch = 65;
		// char�� ���ͷ��� ''(Ȧ����ǥ) ���� �ѱ���
		
		
		
		// ���ڿ� �� ����
		str = "���� ������.....................\n...........................";
		
		// String �� ���ͷ��� "" ���� ���ڿ�		
		System.out.println("isTrue : "+ isTrue);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : "+ sNum);
		System.out.println("iNum : "+ iNum);
		System.out.println("lNum : "+ lNum);
		System.out.println("fNum : "+ fNum);
		System.out.println("dNum : "+ dNum);
		System.out.println("ch : "+ ch);
		System.out.println("str : "+ str);
		
		
	}
	
	
	
	// ���� ����� ���ÿ� �ʱ�ȭ
	public void initVariable() {
		
		boolean isTrue = false;
		
		byte bNum = -128; // 1byte
		short sNum = 500; // 2byte
		int iNum = 100000; // 4byte 
		long lNum = 12345678900L; // 8byte
		
		float fNum = 1.1234567f; // 4byte 
		double dNum = 1.123456789012345; // 8byte
		
		char ch = 'A'; // 2byte 
		String str = "Hello World "; // 4byte (������)
		
	}
	
	
	
	
	
	
	
	
	
	
	
}