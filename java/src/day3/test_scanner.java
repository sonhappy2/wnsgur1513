package day3;

import java.util.Scanner;

public class test_scanner {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
//		    Scanner sc = new Scanner(System.in);
		 int num1=0, num2=0;
		 
		 
		 
		 System.out.print("첫번째 숫자를 입력하세요 : ");
		 num1 = scan.nextInt();
		 
		
		 System.out.print("두번째 숫자를 입력하세요 : ");
		 num2 = scan.nextInt();
		 
		 System.out.print("덧셈 결과는 "+ (num1 + num2) + "입니다."); 
		 
		 
		 
		 

	}

}
