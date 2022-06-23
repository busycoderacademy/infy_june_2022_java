package com.day5.session1.ex_handling.ex2;

class AccountCreationException extends Exception{
	public AccountCreationException(String message) {
		super(message);
	}
}

class NotSufficientFundException extends Exception{
	public NotSufficientFundException(String message) {
		super(message);
	}
}

class OverFundException extends RuntimeException{
	public OverFundException(String message) {
		super(message);
	}
}

//SBI-1000, 5L
class Account {
	private int id;
	private String name;
	private double balance;

	public Account(int id, String name, double balance)
			throws AccountCreationException {
		this.id = id;
		this.name = name;
		if(balance<1000)
			throw new AccountCreationException("account can not be create with initial amount "+ balance);
		this.balance = balance;
	}

	public void withdraw(double amount)throws NotSufficientFundException {
		//min balance in all the situaltion must be 1K
		double tempAmount=balance-amount;
		if(tempAmount<1000) {
			throw new NotSufficientFundException("you must have min 1K in our bank in all the condition");
		}
		balance = balance - amount;
	}

	public void deposit(double amount)throws OverFundException {
		double tempAmount=balance+amount;
		if(tempAmount>=500000)
			throw new OverFundException("pls open current account with us");
		balance = balance + amount;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}

public class AccountApplication {

	public static void main(String[] args) {
		Account account;
		try {
			account = new Account(1, "RAJ", 6000);
			account.deposit(4000000);
			System.out.println(account);
		} catch (AccountCreationException e) {
			System.out.println(e.getMessage());
		}catch (OverFundException e) {
			System.out.println(e.getMessage());
		}
	
	}

}
