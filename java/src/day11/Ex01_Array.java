package day11;

import java.util.Scanner;

public class Ex01_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=0,number=0,sum=0,max=0,temp=0; boolean run=true;
		int[] score = null;
		do {
			System.out.println("--------------------------------------------------");
			System.out.println("1.학생수 | 2.정수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택>");
		     num=sc.nextInt();
			if(num==1) {
				System.out.print("학생수>");
				 number=sc.nextInt();
				 score=new int[number];
				
				
				
			}else if(num==2) {
				
				for(int j=0; j<score.length;j++) {
					System.out.print((j+1)+"번째 학생점수 : ");
					score[j]=sc.nextInt();
					sum+=score[j];
					if(max<=score[j]) {
						max=score[j];
					}
					
							
							
						}
			}else if(num==3) {
				for(int k=0;k<score.length;k++) {
					System.out.println((k+1)+"번쨰"+  "학생점수 : " +score[k]);
				}
				 
			}else if(num==4) {
				System.out.println("최고점수 : " +max);
				System.out.println("평균점수 : "+sum/score.length );
				
			
					for(int x=0;x<score.length;x++) {
						for(int y=x+1;y<score.length;y++) {
							if(score[x]<score[y]) {
								temp=score[x];
								score[x]=score[y];
							score[y]=temp;
							}
						}
						}
			    for(int z=0; z<score.length;z++ ) {
			    	System.out.println(score[z]);
			    }
				
						
				
							
				}else {System.out.println("시스템 종료");
					run =false;
				}
			}
				
				
			
		while(run);
		
		
			
		
	}
}
