package day13;

public class MemberMain {

	public static void main(String[] args) {
		// Member Ŭ���� ��ü ����
		// �⺻�����ڸ� �̿��� ��ü
		Member m1= new Member();
	   m1.id="id11";
	    m1.password = "��й�ȣ";
		m1.name = "�̸��̸�";
		m1.age = 99;

      System.out.println("info");
		m1.info();
		System.out.println("update");
		m1.update("�����̸�");
		m1.info();
		System.out.println("myname");
		m1.myName();
		m1.info();
		String name1 = m1.myName();
		System.out.println(m1.myName());
		System.out.println(name1);
		
		// �Ű������� �ִ� �����ڸ� �̿��� ��ü
		System.out.println("�Ű������ִ°�");
		Member m2 =
				new Member("id1","pppp","�̸�1",11);
		m2.info();
		
		

	}

}
