package day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02_ArrayListEx {

	public static void main(String[] args) {
		/*
		 * ArrayList�� ����� �� �ܾ� 5���� ��ĳ�ʷ� �Է� �ް�
		 * �Է¹��� �ܾ ��� ����ϰ�
		 * ���������� ���� �� �ܾ ����ϼ���
		 */
		String a;
		int max=0;
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		System.out.print("�ܾ� �Է� : ");
		a=sc.next();
		System.out.print("�ܾ� �Է� : ");
		a=sc.next();
		System.out.print("�ܾ� �Է� : ");
		a=sc.next();
		System.out.print("�ܾ� �Է� : ");
		a=sc.next();
		System.out.print("�ܾ� �Է� : ");
		a=sc.next();
		list.add(a);
		list.add(a);
		list.add(a);
		list.add(a);
		list.add(a);
		for(int i=0;i<list.size(); i++) {
			System.out.println(list.get(i));
		
		}
		for(int i=0; i<a.length(); i++) {
			;
		}
		
		System.out.println("���� �� �ܾ�� : " );
	}

}
