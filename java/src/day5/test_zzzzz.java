package day5;

import java.util.Scanner;

public class test_zzzzz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, max = 0;
		System.out.print("첫번째 숫자 : ");
		num1 = scan.nextInt();
		System.out.println("두번째 숫자 : ");
		num2 = scan.nextInt();
		System.out.println("세번째 숫자 : ");
		num3 = scan.nextInt();

		// max 변수 활용해보기
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
		System.out.println("가장 큰 수는 " + max + "입니다");
	}

}
