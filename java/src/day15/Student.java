package day15;

public class Student {

	/*
	 * ���� ���� �� : public, default public : ������ ���� ���� private : Ŭ���� �������� ������ ������. �ٸ�
	 * Ŭ����
	 */
//    Student Class
//    -�̸�(name), ��ȭ��ȣ(phone), �ּ�(address)�ʵ�
//    ������
//    -�⺻������
//    -��� �ʵ带 �Ű������� �ϴ� ������
//    
//    StudentMain class
//    studentŬ���� ��ü�� �����ϰ� �ʵ尪�� ������ �� �� ��ü�� ArrayList�� ����.

	// �ʵ�
	String name;
	String phone;
	String address;

	// �⺻ ������
	Student() {

	}

	// �Ű����� �ִ� ������
	Student(String name, String phone, String address) {

	}

	// name�ʵ��� getter
	// �ʵ尪�� ������ �� ��
	// �ʵ尪 ������ ����
	public String getName() {
		return name;

	}

	// name�ʵ��� setter
	// �ʵ尪�� �ٲ� ��
	// ���� ����.
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		
		
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	// �ʵ�� private���� �����ϰ�
	// get �޼ҵ� set �޼ҵ带

}
