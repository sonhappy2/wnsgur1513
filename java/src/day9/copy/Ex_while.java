package day9.copy;

import java.util.Scanner;

public class Ex_while {
	
	public static void main(String[] args) {
		int num1=0, num=0, sum=0; boolean  run=true;
		Scanner sc = new Scanner(System.in);
		
		switch(sum) {
		case 1:
			System.out.print("예금액>");
			num1 = sc.nextInt();
			num1 += sum;
			System.out.println("현재잔액은 " + sum + "입니다");
			break;
		case 2:
			System.out.print("출금액>");
			num1=sc.nextInt();
			if(num1 > sum) {
				System.out.println("잔고가 부족합니다.");
				System.out.println("현재잔액은 " + sum + "입니다");
			} else {
				sum -= num1;
				System.out.println("현재잔액은 " + sum + "입니다");
			}
			break;
		case 3:
			System.out.println("현재잔액은 " + sum + "입니다");
			break;
		case 4:
			System.out.println("시스템 종료");
			break;
		}
	}

}
