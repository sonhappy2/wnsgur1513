package day3;

import java.util.Scanner;

public class test_if {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1=0;
		System.out.print("������ �Է��ϼ��� : ");
		num1 = scan.nextInt();
		if(num1>=90) {System.out.println("A�����Դϴ�.");}
		else if(num1>=80){System.out.println("B�����Դϴ�.");}
		else if(num1>=70){System.out.println("C�����Դϴ�.");}
		else if(num1>=60) {System.out.println("D�����Դϴ�.");}
		else if(num1<60){System.out.println("F�����Դϴ�.");} 
		
		
		

	}

}
