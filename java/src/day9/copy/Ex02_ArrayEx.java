package day9.copy;

import java.util.Scanner;

public class Ex02_ArrayEx {

	public static void main(String[] args) {
		/* 
		 * ũ�Ⱑ 3�� ������ �迭�� �����ϰ�
		 * ��ĳ�ʸ� �̿��� �迭�� ���� ������ ����
		 * �Էµ� ���� ����, ����� ����ϼ���
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		int sum = 0;
		
		for(int i=0; i<num.length; i++) {
			System.out.print((i+1)+"�� ° ���� �Է� : ");
			num[i]= sc.nextInt();
			sum+=num[i];
		}
		System.out.println(sum);
		System.out.println(sum/num.length);
	}

}

