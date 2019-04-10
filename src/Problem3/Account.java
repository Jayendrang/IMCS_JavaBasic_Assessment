package Problem3;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int accountNumber;
	private double balance;
	private static int totalAccounts;

	public Account() {
		totalAccounts++;
	}

	public Account(int acNo, double bal) {

		this.accountNumber = acNo;
		this.balance = bal;
		totalAccounts++;
	}

	public void deposit(double balance) {
		this.balance += balance;
		System.out.println(this.toString());
	}

	public void withdraw(double balance) {
		this.balance += balance;
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Account Number :\t " + this.accountNumber + "\t Balance : \t" + this.balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static int getTotalAccounts() {
		return totalAccounts;
	}


}
