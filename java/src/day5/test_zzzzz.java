package day5;

import java.util.Scanner;

public class test_zzzzz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, max = 0;
		System.out.print("ù��° ���� : ");
		num1 = scan.nextInt();
		System.out.println("�ι�° ���� : ");
		num2 = scan.nextInt();
		System.out.println("����° ���� : ");
		num3 = scan.nextInt();

		// max ���� Ȱ���غ���
		if (num1 > num2) {
			if (num1 > num3) {
				max = num1;

			} else {
				max = num3;
			}
			if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
		}
		System.out.println("���� ū ���� " + max + "�Դϴ�");
	}

}
