package day5;

import java.util.Scanner;

public class test_zzzz {

	public static void main(String[] args) {
		/*
		 * ���� �ٸ� ���� ������ �Է¹޾� ���� ū ���� ����ϱ� (��, ���� ���ڴ� �Էµ��� �ʴ´ٰ� ����)
		 */
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0;
		System.out.print("���� : ");

		num1 = sc.nextInt();
		System.out.print("���� : ");
		num2 = sc.nextInt();
		System.out.print("���� : ");
		num3 = sc.nextInt();
		if (num1 == num2 && num2 == num3 && num1 == num3) {
			System.out.println("");
		} else {
			if (num1 > num2 && num1 > num3) {
				System.out.println(num1);
			} else if (num2 > num1 && num2 > num3) {
				System.out.println(num2);
			} else if (num3 > num1 && num3 > num2) {
				System.out.println(num3);
			}

		}
	}

}
