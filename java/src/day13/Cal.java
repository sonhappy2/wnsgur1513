package day13;

import java.util.Scanner;

public class Cal {
	int num1 , num2 ,min,st,fi;
	Scanner sc=new Scanner(System.in);
	 Cal(){
		 this.num1=num1;
		 this.num2=num2;
		 this.min=min;
		 this.st=st;
		 this.fi=fi;
	 }
	 Cal(int num1, int num2, int min ,int st,int fi){
		 this.num1=num1;
		 this.num2=num2;
		
		 
		 
	 }
	 
	 void add(int num1, int num2) {
		int sum=num1+num2;
		System.out.println(sum); 
	 }
	 int minor() {
		   min = num1-num2;
		  return this.min;
		 
	 }
	 int star() {
		   st=num1*num2;
		  return this.st;
		 
	 }
	 int final1() {
		
		 System.out.print("숫자 입력 : ");
		 num1=sc.nextInt();
		 System.out.print("숫자 입력 : ");
		 num2=sc.nextInt();
		 fi=num1/num2;
		   return this.fi;
		   
		 
	 }
	    
	 
	  
	  

}
