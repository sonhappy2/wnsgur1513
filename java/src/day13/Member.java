package day13;

public class Member {
	String id; String password; String name; int age;
	
	// ������ ����
	// �⺻������
	// �������̸� : Ŭ�����̸��� ������
	Member(){
		this.id=id;
		this.password=password;
		this.name=name;
		this.age=age;
	}
	// ��� �ʵ带 �Ű������� �ϴ� ������
	Member(String id, String password, String name, int age ) {
		this.id=id;
		this.password=password;
		this.name=name;
		this.age=age;
	}
	// ���� ���� �Ű����� ����
	void info() {
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.name);
		System.out.println(this.age); 
	}
	// update �޼ҵ� ���� �� �� �Ű����� ����
	void update(String name) {
		this.name=name;
	}
	// myName �޼ҵ� ���� �ְ� �Ű����� ����
   String myName() {
	   return this.name;
	   
   }
	
	

}
