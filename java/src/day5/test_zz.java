package day5;

import java.util.Scanner;

public class test_zz {

	public static void main(String[] args) {
		/*
		 * �հ� ���հ� ��� ���α׷� 1. �Է°� : �г�,���� 2. ��� ���� -1~3�г��� ������ 60�� �̻��̾�� �հ��̶�� ��� -4�г���
		 * 70�� �̻��̾�� �հ��̶�� ���
		 */
		Scanner sc = new Scanner(System.in);
		int num = 0, num1 = 0;
		System.out.print("�г��� �Է��Ͻÿ� : ");
		num = sc.nextInt();

		System.out.print("������ �Է��Ͻÿ� : ");
		num1 = sc.nextInt();
		if (num == 1 || num == 2 || num == 3) {
			if (num1 >= 60) {
				System.out.println("�հ�");
			} else {
				System.out.println("���հ�");
			}
		}
		if (num == 4) {
			if (num1 >=70) {
				System.out.println("�հ�");
			} else {
				System.out.println("���հ�");
			}
		}

	}

}
