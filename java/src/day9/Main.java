package day9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
int i,j, num=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		num = sc.nextInt();
		for (i = 1; i <= num; ++i) {
			for (j = 1; j <= num - i; ++j) {
				System.out.print("");
				}
				for (j = 1; j <= i; ++j) {
					System.out.print("*");
				}
				System.out.println();
			
		}

	}

}
