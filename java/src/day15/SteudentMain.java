package day15;

import java.util.ArrayList;
import java.util.List;

public class SteudentMain {

	public static void main(String[] args) {
	  Student stu1 = new Student();
	  // setter�� �̿��Ͽ� �ʵ尪 ����
	  // private���� �����߱� ������ ���ٺҰ�
	  
	  stu1.setName("�л�1");
	  stu1.setPhone("010-1111-1111");
	  stu1.setAddress("��õ������");
	  
	  // getter�� �̿��Ͽ� �ʵ尪 ��������
	  String var2 = stu1.getName();
	  System.out.println(var2);
	  System.out.println("Ȯ��");
	  System.out.println(stu1.getAddress());
	  
	  Student stu2 = new Student();
	  
	  stu2.name = "�л�2 ����";
	  stu2.setName("�л�2 ����");
	  
	  // Student ��ü�� ArrayList�� �����ϱ�
	  // Student ��ü�� ���� �� �ִ� ArrayList �ʿ�
	  List<Student> stuList = new ArrayList<Student>();
	  
	  stuList.add(stu1);
	  stuList.add(stu2);
	  
	  // stuList�� 0�� �ε����� ������ stu1�� name�� ����غ���
	  System.out.println(stuList.get(0).getName());
	  System.out.println(stuList.get(1).getName());
	  
	  
	  

	}

}
