package day14test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankMain {
	// DTo(Data Transfer Object) : 데이터 전달을 위한 객체(클래스)
	// VO(Value Object), Bean

	public static void main(String[] args) {
		boolean run=true;  int client=0;String nam = null; String account ;int bal=0;
		Scanner sc = new Scanner(System.in);
		
		
		 
	
		
		List<Bank> clientlist = new ArrayList<Bank>();
       
		
		
		 
		
		
		
		
		
	do {	
	System.out.println("1. 고객등록(get.set) | 2. 고객등록(생성자) | 3. 입금 | 4. 출금 | 5. 고객리스트 | 6. 종료");
	System.out.print("선택>");
	int num=sc.nextInt();
	
	
	if(num==1) {
		
	
		Bank b1 = new Bank();
		System.out.print("이름 :");
		nam=sc.next();
		System.out.print("계좌 : ");
		account=sc.next();
		System.out.print("입금액 : ");
		bal=sc.nextInt();
		b1.setClientNumber(client);
		b1.setName(nam);
		b1.setAccountNumber(account);
		b1.setBalance(bal);
		clientlist.add(b1);
		
		
		 }else if(num==2) {
			 
			
			
			
			 Bank b1 = new Bank();
			 System.out.print("이름 :");
				nam=sc.next();
				System.out.print("계좌 : ");
				account=sc.next();
				System.out.print("입금액 : ");
				bal=sc.nextInt();
				b1.Bank(client , nam, account, bal);
				clientlist.add(b1);
				
				
		 }else if(num==3) {
			 Bank b1 = new Bank();
			 System.out.print("계좌 : ");
			 account=sc.next();
			 System.out.print("입금액 : ");
			 int deposit=sc.nextInt();
			 for(int i=0; i<clientlist.size();i++) {
				 if(account.equals(clientlist.get(i).getAccountNumber())) {
					 bal= clientlist.get(i).getBalance()+ deposit;
					 clientlist.get(i).setBalance(bal);
				 }
			 }
			 
			 
		 }else if(num==4) {
			 Bank b1 = new Bank();
			 System.out.print("계좌 : ");
			 account=sc.next();
			 System.out.print("입금액 : ");
			 int witdraw=sc.nextInt();
			 for(int i=0; i<clientlist.size();i++) {
				 if(account.equals(clientlist.get(i).getAccountNumber())) {
					 if(witdraw <= clientlist.get(i).getBalance()) {
						 
					 
					 bal= clientlist.get(i).getBalance()- witdraw;
					 clientlist.get(i).setBalance(bal);
					 }else {System.out.println("잔고가 부족합니다");}
				 }else {
					 System.out.println("없는계좌입니다.");
				 }
			 }
			 }
	
	else if(num==5) {
		
	for(int i=0;i<clientlist.size();i++) {
	
			System.out.println("Bank [clientNumber= "+clientlist.get(i).getClientNumber()+" name="+clientlist.get(i).getName()+
					" accountNumber="+clientlist.get(i).getAccountNumber()+" 1balance="+clientlist.get(i).getBalance()+"]");
	}
		
	
		
		
	}
	}while(run);
	}

}
