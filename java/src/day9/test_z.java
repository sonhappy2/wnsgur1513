package day9;

import java.util.Scanner;

public class test_z {

	public static void main(String[] args) {
		/*
		 * �ӱ�, ���, �ܾ���ȸ ��ɸ� ����. �ʱ� �ܰ�� 0 �ܰ� ���� ������ �ʿ���. (�Ա�, ��ݽ� �ܰ� ���� ���� �ٲ��� ��.)
		 * 
		 */
		int num = 0, sum = 0, num1 = 0 ;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("------------------------------------");
			System.out.print("����> ");
			num = sc.nextInt();
		
			if (num == 1) {

				System.out.print("���ݾ�>");
				num1 = sc.nextInt();
				System.out.println("���� �ܾ��� " + (sum + num1) + "�Դϴ�.");
				sum+=num1;
			} else if (num == 2) {

				System.out.print("��ݾ�>");
				num1 = sc.nextInt();
				if (num1 <= sum) {

					System.out.println("�����ܾ��� " + (sum - num1) + "�Դϴ�.");
					sum-=num1;
				} else {
					System.out.println("�ܰ� �����մϴ�");
					System.out.println("�����ܾ��� " + sum + "�Դϴ�");

				}

			} else if (num == 3) {

				System.out.println("�ܰ�>�����ܾ��� " + sum + "�Դϴ�.");
			} else if (num == 4) {
				System.out.println("�ý��� ����");
				run = false;
			}
			
			

		} while (run);

	}

}
