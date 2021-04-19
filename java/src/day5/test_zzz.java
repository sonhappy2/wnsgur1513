package day5;

import java.util.Scanner;

public class test_zzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0, score = 0;
		System.out.print("점수 : ");
		score = sc.nextInt();
		System.out.println("학년 : ");
		year = sc.nextInt();
		// 중첩 if문
		if (score >= 60) {
			if (year != 4) {
				System.out.println("합격");
			} else if (score >= 70) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}

		} else {
			System.out.println("불합격");
		}

	}

}
