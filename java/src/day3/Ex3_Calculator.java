package day3;

import java.util.Scanner;

public class Ex3_Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1=0, num2=0, sum=0;
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : " );
		num1 = scan.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : " );
		num2 = scan.nextInt();
		sum = num1 + num2;
		System.out.println("���� ����� " + sum + "�Դϴ�.");
		

	}

}
