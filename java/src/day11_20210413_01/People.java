package day11_20210413_01;

public class People {
	// �ʵ�, ������, �޼ҵ�
	// �ʵ� ����
	String name;
	int age;
	String nation;
	
	// ������ ����
	People() {
		nation = "���ѹα�";
	}
	// �Ű������� �ִ� ������
	People(String name, int age){
		// �Ű������� ����ϴ� ����
		/*
		 * �����ڿ��� �ʵ尪�� �����ϰų�
		 * �޼ҵ忡�� ó���� ���� �ѱ� ��
		 */
		// �Ѱܹ��� �Ű������� �ʵ尪���� ����
		this.name = name;
		this.age = age;
	}

}
