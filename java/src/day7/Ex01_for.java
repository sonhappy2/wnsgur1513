package day7;

public class Ex01_for {

	public static void main(String[] args) {
		// ��ø for��
		for (int i = 1; i <= 2; i++) {
			System.out.println("j for�� ����");
			for (int j = 1; j <= 5; j++) {
				System.out.print("i�� : " + i);
				System.out.println(", j�� : " + j);
			}
			int j = 0;
			//System.out.println(j); ���Ұ�
			System.out.println("j for�� ��");
			

		}
		System.out.println("i for�� ��");
// ���� ����
		/*
		 * 1-2-3-4-5 : i : 1, j : 1 6-4-5 : 1,2 7-2-3-4-5 : 1,3 7-2-3-4-5 : 2,1
		 * 
		 * 
		 */

	}

}
