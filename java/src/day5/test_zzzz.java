package day5;

import java.util.Scanner;

public class test_zzzz {

	public static void main(String[] args) {
		/*
		 * 서로 다른 숫자 세개를 입력받아 가장 큰 숫자 출력하기 (단, 같은 숫자는 입력되지 않는다고 가정)
		 */
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0;
		System.out.print("숫자 : ");

		num1 = sc.nextInt();
		System.out.print("숫자 : ");
		num2 = sc.nextInt();
		System.out.print("숫자 : ");
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
