package day14test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankMain {
	// DTo(Data Transfer Object) : ������ ������ ���� ��ü(Ŭ����)
	// VO(Value Object), Bean

	public static void main(String[] args) {
		boolean run=true;  int client=0;String nam = null; String account ;int bal=0;
		Scanner sc = new Scanner(System.in);
		
		
		 
	
		
		List<Bank> clientlist = new ArrayList<Bank>();
       
		
		
		 
		
		
		
		
		
	do {	
	System.out.println("1. �����(get.set) | 2. �����(������) | 3. �Ա� | 4. ��� | 5. ������Ʈ | 6. ����");
	System.out.print("����>");
	int num=sc.nextInt();
	
	
	if(num==1) {
		
	
		Bank b1 = new Bank();
		System.out.print("�̸� :");
		nam=sc.next();
		System.out.print("���� : ");
		account=sc.next();
		System.out.print("�Աݾ� : ");
		bal=sc.nextInt();
		b1.setClientNumber(client);
		b1.setName(nam);
		b1.setAccountNumber(account);
		b1.setBalance(bal);
		clientlist.add(b1);
		
		
		 }else if(num==2) {
			 
			
			
			
			 Bank b1 = new Bank();
			 System.out.print("�̸� :");
				nam=sc.next();
				System.out.print("���� : ");
				account=sc.next();
				System.out.print("�Աݾ� : ");
				bal=sc.nextInt();
				b1.Bank(client , nam, account, bal);
				clientlist.add(b1);
				
				
		 }else if(num==3) {
			 Bank b1 = new Bank();
			 System.out.print("���� : ");
			 account=sc.next();
			 System.out.print("�Աݾ� : ");
			 int deposit=sc.nextInt();
			 for(int i=0; i<clientlist.size();i++) {
				 if(account.equals(clientlist.get(i).getAccountNumber())) {
					 bal= clientlist.get(i).getBalance()+ deposit;
					 clientlist.get(i).setBalance(bal);
				 }
			 }
			 
			 
		 }else if(num==4) {
			 Bank b1 = new Bank();
			 System.out.print("���� : ");
			 account=sc.next();
			 System.out.print("�Աݾ� : ");
			 int witdraw=sc.nextInt();
			 for(int i=0; i<clientlist.size();i++) {
				 if(account.equals(clientlist.get(i).getAccountNumber())) {
					 if(witdraw <= clientlist.get(i).getBalance()) {
						 
					 
					 bal= clientlist.get(i).getBalance()- witdraw;
					 clientlist.get(i).setBalance(bal);
					 }else {System.out.println("�ܰ� �����մϴ�");}
				 }else {
					 System.out.println("���°����Դϴ�.");
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
