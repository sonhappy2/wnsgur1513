package day3;

public class Ex9_RandomMethod {

	public static void main(String[] args) {
		// Random �޼ҵ�
		// Ư�� ���� ������ ���ڸ� �ϳ� ������ִ� �޼ҵ�
		// 1~10 ������ ���� �ϳ��� �������� �߻�
		/* (int)(math.random() * 10) + 1
		 * random() 0���� ũ�ų� ���� 1���� ���� ���ڸ� �߻���Ŵ
		 * 
		 */
System.out.println(Math.random());
System.out.println((Math.random()*10));
System.out.println((int)(Math.random()*10));// ��������ȯ
System.out.println((int)(Math.random()*10+1));
	}

}
