package day3;

public class Ex_IncreaseOpreator {

	public static void main(String[] args) {
		/* 
		 * ����(variable)
		 * ���������� (++, --)
		 * ������ �Ǵ� �����ڿ� ���
		 * ��ġ�� ���� ������ �޶���
		 * ++var : var�� ������ �ִ� ���� 1�� ������ �� ���꿡 ���
		 * var++ : var�� ������ �ִ� ���� ���꿡 ��� �� var�� ���� 1����
		 * �ݺ���. for��
		 */
		
		int num1 = 9;
		int num2 = 10;
		int num3;
		
		// ++�� ���� �տ� ���� ��
		// num1= 10, num3=0
		System.out.println("num1 : " + num1);
		num3 = --num1 + 10; // 11+10
        System.out.println("num1 : " + num1);
        System.out.println("num3 : " + num3);	
        
     // ++�� ���� �ڿ� ���� ��
     		System.out.println("num1 : " + num1);
     		num3 = num1-- + 10;
             System.out.println("num1 : " + num1);
             System.out.println("num3 : " + num3);
           
             num3 = num1++ + num2++; 
             System.out.println("num1 :" + num1);
             System.out.println("num2 :" + num2);
             System.out.println("num3 :" + num3);
             
             
	}
	
	        
	       
	        
	         
   
}
