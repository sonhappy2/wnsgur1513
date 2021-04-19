package day14test;

public class Bank {
	private int clientNumber;
	private String name;
	private String accountNumber;
	private int balance;
	
	
	
	Bank(){
		
		
	}
	Bank(int clientNumber, String name, String accountNumber, int balance){
		super();
		this.clientNumber=clientNumber;
		this.name=name;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	
	
	public int getClientNumber() {
		return clientNumber;
		
	}
	public void setClientNumber(int clientNumber) {
		this.clientNumber=clientNumber;
		
	}
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAccountNumber() {
		return accountNumber=accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber=accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
	void Bank(int clientNumber, String name
			,String accountNumber, int balance) {
		this.clientNumber=clientNumber;
		this.name=name;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	int add(){
		balance+=balance;
		return this.balance;
	}
	
	
	

	 
	
	
	
	

}
