package day3;

public class Ex_IncreaseOpreator {

	public static void main(String[] args) {
		/* 
		 * 변수(variable)
		 * 증강연산자 (++, --)
		 * 변수앞 또는 변수뒤에 사용
		 * 위치에 따라 역할이 달라짐
		 * ++var : var가 가지고 있는 값에 1을 증가한 뒤 연산에 사용
		 * var++ : var가 가지고 있는 값을 연산에 사용 후 var의 값을 1증가
		 * 반복문. for문
		 */
		
		int num1 = 9;
		int num2 = 10;
		int num3;
		
		// ++이 변수 앞에 붙을 때
		// num1= 10, num3=0
		System.out.println("num1 : " + num1);
		num3 = --num1 + 10; // 11+10
        System.out.println("num1 : " + num1);
        System.out.println("num3 : " + num3);	
        
     // ++이 변수 뒤에 붙을 때
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
