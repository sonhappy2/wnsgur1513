package day3;

import java.util.Scanner;

public class test_if {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1=0;
		System.out.print("점수를 입력하세요 : ");
		num1 = scan.nextInt();
		if(num1>=90) {System.out.println("A학점입니다.");}
		else if(num1>=80){System.out.println("B학점입니다.");}
		else if(num1>=70){System.out.println("C학점입니다.");}
		else if(num1>=60) {System.out.println("D학점입니다.");}
		else if(num1<60){System.out.println("F학점입니다.");} 
		
		
		

	}

}
