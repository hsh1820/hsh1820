package com.kh.chap4_constructor.model.vo;

public class User {
		// �ʵ� 
		private String userId;
		private String userPwd;
		private String userName;
		private int age;
		private char gender;
		
		// ������
		/*
		 *  * �����ڸ� ����ϴ� ����
		 * 1. ��ü�� �������ֱ� ���� ���� 
		 * 2. �Ű������� ���޹��� ���� �ʵ忡 �ʱ�ȭ�� ���� // ��ü�� ��������ڸ��� ���� �ִ�
		 *  
		 *  * ������ ��� �� ���ǻ���
		 *  1. �����ڸ��� �ݵ�� Ŭ���� ��� ���ƾ� �Ѵ�.
		 *  2. ��ȯ���� �������� �ʴ´�.
		 *  3.******* �Ű����� �ִ� ������ �ۼ� �� *********************
		 *  	*******�⺻ �����ڸ� �ݵ�� �ۼ��ؾ��Ѵ�. ****************   ==> �����ε�
		 * 		.******* --> JVM�� �⺻�����ڸ� �ڵ� �������� �� �ϱ� ����.
		 * 
		 * */

		// �⺻������ // ����ִ� �������ζ� ����ڴ� �Ű�����X
				public User() {
						System.out.println("User  ��ü�� ������ .");
						
				}
			//  ���� ��ü�� ������ �� �� ���
			// --> �� �ʱ�ȭ ���� Ʋ�� ����� �δ� �� // �޸� ������ �Ҵ�
			
			// ���� Ŭ���� ���ο� �ƹ� �����ڵ� �ۼ����� �ʾҴٸ� 
			// JVM�� �ڵ����� ������ �ڵ忡 ��������
		
		// �Ű� ���� �ִ� ������   
		// ��ü ������ ���ÿ� �Ű������� ���޵� ������ 
		// �ش� ��������� �ʱ�ȭ �ϴ� �������� ���
		
		public User(String userId, String userPwd, String userName, int age, char gender) {
			this.userId = userId;
			this.userPwd = userPwd;
			this.userName = userName;
			this.age = age;
			this.gender = gender;
			
			System.out.println("�Ű� ���� �ִ� �����ڷ� ��ü ����");
		}
			
		// userId - setter (��Ŭ�� -> source -> generate getter / setter
			public void setUserId(String userId) {
				this.userId = userId;
			}
			public String getUserId() {
				return userId;
			}

			public String getUserPwd() {
				return userPwd;
			}

			public void setUserPwd(String userPwd) {
				this.userPwd = userPwd;
			}

			public String getUserName() {
				return userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

			public char getGender() {
				return gender;
			}

			public void setGender(char gender) {
				this.gender = gender;
			}
			
			
			
		// ���� ��ü�� ������ �ִ� ��� �ʵ��� ������ ��ȯ�ϴ� �޼ҵ�	
		public String inform() {
			return userId + ", " + userPwd+ ", " +userName + ", " + age + ", " + gender ; 
		}
		
		
}
