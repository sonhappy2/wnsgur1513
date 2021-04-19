package day5;

import java.util.Scanner;

public class test_zz {

	public static void main(String[] args) {
		/*
		 * 합격 불합격 출력 프로그램 1. 입력값 : 학년,점수 2. 출력 조건 -1~3학년은 점수가 60점 이상이어야 합격이라고 출력 -4학년은
		 * 70점 이상이어야 합격이라고 출력
		 */
		Scanner sc = new Scanner(System.in);
		int num = 0, num1 = 0;
		System.out.print("학년을 입력하시오 : ");
		num = sc.nextInt();

		System.out.print("학점을 입력하시오 : ");
		num1 = sc.nextInt();
		if (num == 1 || num == 2 || num == 3) {
			if (num1 >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		}
		if (num == 4) {
			if (num1 >=70) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		}

	}

}
