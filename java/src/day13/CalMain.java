package day13;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
			boolean run=true; 
		Scanner sc = new Scanner(System.in);
		Cal c = new Cal();
		do {
			
		    System.out.println("1.���� | 2.���� | 3.���� | 4.������ | 5.����");
		    System.out.print("����>");
		   int num=sc.nextInt();
		   if(num==1) {
			   c.add(0, 0);
		   } else if(num==2) {
			   System.out.print("�����Է� : ");
				c.num1=sc.nextInt();
		        System.out.print("�����Է� : ");	
		        c.num2=sc.nextInt();
		       System.out.println(c.minor());
		   } else if(num==3) {
			   System.out.print("�����Է� : ");
				c.num1=sc.nextInt();
				System.out.println("�����Է� : ");
				c.num2=sc.nextInt();
				System.out.println(c.star());
		   }else if(num==4) {
			   System.out.println(c.final1());
		   }else {
			   run=false;
		   }
			
		} while(run);
		
		
      
        
	
		
	

	}

}
