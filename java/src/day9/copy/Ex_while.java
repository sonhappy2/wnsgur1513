package day9.copy;

import java.util.Scanner;

public class Ex_while {
	
	public static void main(String[] args) {
		int num1=0, num=0, sum=0; boolean  run=true;
		Scanner sc = new Scanner(System.in);
		
		switch(sum) {
		case 1:
			System.out.print("���ݾ�>");
			num1 = sc.nextInt();
			num1 += sum;
			System.out.println("�����ܾ��� " + sum + "�Դϴ�");
			break;
		case 2:
			System.out.print("��ݾ�>");
			num1=sc.nextInt();
			if(num1 > sum) {
				System.out.println("�ܰ� �����մϴ�.");
				System.out.println("�����ܾ��� " + sum + "�Դϴ�");
			} else {
				sum -= num1;
				System.out.println("�����ܾ��� " + sum + "�Դϴ�");
			}
			break;
		case 3:
			System.out.println("�����ܾ��� " + sum + "�Դϴ�");
			break;
		case 4:
			System.out.println("�ý��� ����");
			break;
		}
	}

}
