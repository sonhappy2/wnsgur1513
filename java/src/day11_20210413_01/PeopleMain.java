package day11_20210413_01;

public class PeopleMain {

	public static void main(String[] args) {
		// PeopleMain Ŭ�������� People Ŭ������
		// ��ü�� ����� Ȱ��
		
		// People Ŭ���� ��ü ����
		People p =new People();
		
		// ��ü�� ������ Ŭ������ ������ �մ�
		// �ڿ�(�ʵ�, �޼ҵ�) Ȱ��
		// People Ŭ������ ������ �ִ� �ʵ忡 �� ���� �� ���
        p.name = "�̸�1";
        p.age = 10;
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.nation);
        p.nation = "�̱�";
        System.out.println(p.nation);
        
         People p1 = new People();
         p1.name = "�̸�2";
         System.out.println(p1.name);
         
         // �Ű������� �ִ� �����ڸ� �̿��� ��ü(�ν��Ͻ�) ����
         People p3 = new People("�̸�4", 30);
         System.out.println(p3.name);
         System.out.println(p3.age);
         System.out.println(p3.nation);
	}

}
