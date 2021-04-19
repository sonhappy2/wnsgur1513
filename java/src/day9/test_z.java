package day9;

import java.util.Scanner;

public class test_z {

	public static void main(String[] args) {
		/*
		 * 임금, 출금, 잔액조회 기능만 있음. 초기 잔고는 0 잔고를 위한 변수가 필요함. (입금, 출금시 잔고 변수 값이 바껴야 함.)
		 * 
		 */
		int num = 0, sum = 0, num1 = 0 ;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			num = sc.nextInt();
		
			if (num == 1) {

				System.out.print("예금액>");
				num1 = sc.nextInt();
				System.out.println("현재 잔액은 " + (sum + num1) + "입니다.");
				sum+=num1;
			} else if (num == 2) {

				System.out.print("출금액>");
				num1 = sc.nextInt();
				if (num1 <= sum) {

					System.out.println("현재잔액은 " + (sum - num1) + "입니다.");
					sum-=num1;
				} else {
					System.out.println("잔고가 부족합니다");
					System.out.println("현재잔액은 " + sum + "입니다");

				}

			} else if (num == 3) {

				System.out.println("잔고>현재잔액은 " + sum + "입니다.");
			} else if (num == 4) {
				System.out.println("시스템 종료");
				run = false;
			}
			
			

		} while (run);

	}

}
