package day5;

import java.util.Scanner;

public class test_zzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0, score = 0;
		System.out.print("���� : ");
		score = sc.nextInt();
		System.out.println("�г� : ");
		year = sc.nextInt();
		// ��ø if��
		if (score >= 60) {
			if (year != 4) {
				System.out.println("�հ�");
			} else if (score >= 70) {
				System.out.println("�հ�");
			} else {
				System.out.println("���հ�");
			}

		} else {
			System.out.println("���հ�");
		}

	}

}
