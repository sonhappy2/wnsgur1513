package day15;

public class People {
//	People Class
//	*�ʵ�(���������ڴ� private��)
//	-�̸�(name), �ֹι���(rNumber), �ּ�(address), ����(age)
//	*������
//	  -�⺻������, ��� �ʵ带 �Ű������� �ϴ� ������
//    PeopleMain Class
//    *PeopleŬ���� ��ü�� 3������ ���� �ʵ尪�� �Է��� ��
//     -��ü�� ���� ���� �⺻�����ڸ� Ȱ��
//     *peopleList��� ArrayList�� ����
//     *ArrayList�� ��� ��� ������ ���
	
	private String name;
	private String rNumber;
	private String address;
	private int age;
	
	People(){
		
	}
	
	public People(String name, String rNumber, String address, int age) {
		// �θ�Ŭ������ ������ �մ� �����ڸ� ȣ��
		super();
		this.name = name;
		this.rNumber = rNumber;
		this.address = address;
		this.age=age;
	}
}
