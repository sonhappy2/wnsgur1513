package day7;

public class Ex01_for {

	public static void main(String[] args) {
		// 중첩 for문
		for (int i = 1; i <= 2; i++) {
			System.out.println("j for문 시작");
			for (int j = 1; j <= 5; j++) {
				System.out.print("i값 : " + i);
				System.out.println(", j값 : " + j);
			}
			int j = 0;
			//System.out.println(j); 사용불가
			System.out.println("j for문 끝");
			

		}
		System.out.println("i for문 끝");
// 실행 순서
		/*
		 * 1-2-3-4-5 : i : 1, j : 1 6-4-5 : 1,2 7-2-3-4-5 : 1,3 7-2-3-4-5 : 2,1
		 * 
		 * 
		 */

	}

}
