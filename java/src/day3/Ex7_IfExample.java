package day3;

import java.util.Scanner;

public class Ex7_IfExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = 0;
		System.out.println("점수를 입력하세요");
		score = scan.nextInt();
		if(score >= 90) {System.out.println("A 학점입니다.");
		} // score < 90
		else if(score >=80) {}
		// scero <= 80, score < 90

	}

}
