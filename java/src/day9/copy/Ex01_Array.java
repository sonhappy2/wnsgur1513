package day9.copy;

public class Ex01_Array {

	public static void main(String[] args) {
		/*
		 * �迭(Array) : ���� Ÿ���� �����͸� �ϳ��� ������ ���� �� ���� �� �ְ� ��.
		 * 
		 */
		
		int num = 0;
			// ���� Ÿ���� number ��� �̸��� �迭 ���� ����
		   int[] number;
		   int number1[];
		   // �迭 ����� ���ÿ� �ʱⰪ
		   int[] number2 = {1,2,3};
		   String[] strArray = {"�����ٶ�", "abcd", "��1a2~!@"};
		   
		   int[] number3 = {4,5,6,7,20,100};
		   // Ư�� ��ġ�� �� ����ϱ�
		   // number3�� 7�� ����ϰ� �ʹٸ�
		   // 4��° ĭ�� �ִ� ���� ����Ѵٴ� ��
		   System.out.println(number3[3]);
		   
		   // number2 �������� 2�� ����غ�����
		   System.out.println(number2[1]);
		   //number3�� 4�� �ε������� 500���� �����ϱ�
		   System.out.println(number3[4]); //������
		   number3[4] = 500;
		   System.out.println(number3[4]); //������
		   
		//   System.out.println(number3[5]); //Exception(����)
		   // �迭�̸�.length : �迭�� ũ�⸦ �˷���
		   // �ε��� ���� 1 ŭ
		   // number3�� ũ�� :6
		   // number3�� �ε��� : 0~5
		   System.out.println(number3.length);
		   
		   // for���� �̿��Ͽ� �迭�� ����� �� ����ϱ�
		   System.out.println(number3[0]);
		   System.out.println(number3[1]);
		   System.out.println(number3[2]);
		   System.out.println(number3[3]);
		   System.out.println(number3[4]);
		   System.out.println(number3[5]);
		  
		   System.out.println("for ����");
		   
		   for (int i = 0; i< number3.length; i++ ) {
			   System.out.println(number3[i]);
		   }
		   System.out.println("����");
		   // number4 �迭 ������ ����� ���� ���հ� ����� ���
		   int[] number4= {1,6,10,100};
		   int  sum=0;
		   for(int i=0; i<number4.length; i++) {
			   sum += number4[i];
			
			   
			   
			   
				
			   
		   }
		   System.out.println(sum);
		   System.out.println(sum/number4.length);
		   
		   // �ʱⰪ�� ���� �ʰ� �迭 ����
		   int[] number5 = null;
		   
		   number5 = new int[5];
		   
		   int[] number6 = new int[6]; //ĭ�� 6��
          System.out.println(number6.length);
          System.out.println(number6[5]);
		  
		 

	}

}
