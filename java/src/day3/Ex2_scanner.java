package day3;

// ���̺귯���� ����� ��
import java.util.Scanner;

public class Ex2_scanner {
	
	public static void main(String[] args) {	    // ��ĳ�� ����� ����ϱ� ���� ��ĳ�� ��ü ����
	    Scanner scan = new Scanner(System.in);
//	    Scanner sc = new Scanner(System.in);
	    String name = "�ʱ갪", address = "�ּ��ʱ갪" ;
	    int age= 0;
	    System.out.println("��ĳ�� �Է��� name : " + name);
	    System.out.print("�̸��� �Է��ϼ��� : ");
	    name = scan.next();
	    System.out.println("��ĳ�ʷ� �Է��� name : " + name);
	    
	    System.out.println("��ĳ�� �Է��� address : " + address);
	    System.out.print("�ּҸ� �Է��ϼ��� : ");
	     address = scan.next();
	     System.out.println("��ĳ�ʷ� �Է��� address : " + address);
	    System.out.println("��ĳ�� �Է��� age : " + age);
	    // ��ĳ�� Ŭ�������� �����ϴ� next() �޼ҵ带 �̿��Ͽ�
	    // String ���� �Է� ���� �� ����.
	    // �� �Է��� ���� name ������ �����ϴ� ����
	    System.out.print("�ּҸ� �Է��ϼ��� : ");
	     
	     address = scan.next();
	    System.out.print("���̸� �Է��ϼ��� : ");
	     age = scan.nextInt();
	     
	    
	    
	    
	    // address, age���� ��ĳ�ʷ� ���� �޾Ƽ� �����ϰ� ����� ���� ����ϼ���
	    // �������� ���� ���� nextInt() �޼ҵ带 ���
	    
	     
	     
	  
	     System.out.println("��ĳ�ʷ� �Է��� age : " + age);
	     
	    
	    
		
	}

	    

}
