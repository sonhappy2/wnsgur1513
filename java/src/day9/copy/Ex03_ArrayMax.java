package day9.copy;

import java.util.Scanner;

public class Ex03_ArrayMax {

	public static void main(String[] args) {
		/*
		 * 크기가 5인 정수형 배열에 스캐너로 값을 입력받아
		 * 입력된 값 중에서 가장 큰 값 출력하기
		 * {3,1,5,2,4}
		 */
		int max=0;
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5]; 
		for(int i=0; i<num.length; i++) {
			System.out.print((i+1)+"번째 숫자 입력 : ");
			num[i]=sc.nextInt();
			if(max<=num[i]) {
				max=num[i];
			}
			}
		System.out.println(max);
		
	
	}

}
