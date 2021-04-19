package day9.copy;

import java.util.Scanner;

public class Ex02_ArrayEx {

	public static void main(String[] args) {
		/* 
		 * 크기가 3인 정수형 배열을 선언하고
		 * 스캐너를 이용해 배열에 값을 저장한 다음
		 * 입력된 값의 총합, 평균을 계산하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		int sum = 0;
		
		for(int i=0; i<num.length; i++) {
			System.out.print((i+1)+"번 째 숫자 입력 : ");
			num[i]= sc.nextInt();
			sum+=num[i];
		}
		System.out.println(sum);
		System.out.println(sum/num.length);
	}

}

