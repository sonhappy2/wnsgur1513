package day5;

import java.util.Scanner;

public class test_zzzzzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str="";
		System.out.print("�ܾ �Է��ϼ��� : ");
		str=sc.next();
		switch(str) {
		case "desk" : 
			System.out.println("å���Դϴ�.");
			break;
		case "chair" :
			System.out.println("�����Դϴ�");
			break;
		case "monitor" :
			System.out.println("������Դϴ�");
			break;
		default :
			System.out.println("������ ���� �ܾ� �Դϴ�.");
			break;
	}
		}
}
