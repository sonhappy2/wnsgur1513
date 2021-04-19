package day7;

import java.util.Scanner;

public class test_zzzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0;
		System.out.print("숫자 입력 : ");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {

			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;

			}

		}
		System.out.println("1부터 " + num + "까지 2,3배수 제외한 합계 : " + sum);
	}

}
