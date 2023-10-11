package com.sreeyaprojectapplication.ProjectApplication;

import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class BankDetails {
	private String account_no="123";
	private String name;
	private String account_type;
	private long balance;
	
	Scanner sc =new Scanner(System.in);
	
	
	public void openAccount() {
		System.out.println("Enter Account number:");
		account_no=sc.next();
		System.out.println("Enter Account type:");
		account_type=sc.next();
		System.out.println("Enter Name:");
		name=sc.next();
		System.out.println("Enter Balance:");
		balance=sc.nextLong();
		System.out.println("Account details:\n"+"Acc_no:"
		+account_no+"\nAcc_type:"+account_type+"\nName:"+name+"\nBalance:"+balance);
		System.out.println("your detalis are entered...");
	}
	
	public void showAccount() {
		System.out.println("Name of account holder:"+name);
		System.out.println("Account number:"+account_no);
		System.out.println("Account Type:"+account_type);
		System.out.println("Account Balance:"+balance);

	}
	public void updateDetails(){
		System.out.println("Enter Account number to update:");
		account_no=sc.next();
		System.out.println("Enter Account type to update:");
		account_type=sc.next();
		System.out.println("Enter Name to update:");
		name=sc.next();
		System.out.println("Enter Balance to update:");
		balance=sc.nextLong();
		System.out.println("Account details:\n"+"Acc_no:"
		+account_no+"\nAcc_type:"+account_type+"\nName:"+name+"\nBalance:"+balance);
		System.out.println("your detalis are updated successfully....");
		
	}
	
	public void deposit() {
		long amount;
		System.out.println("Enter the amount you want to deposite:");
		amount=sc.nextLong();
		balance=balance+amount;
	}
	public void withdrawal() {
		long amount;
		System.out.println("Enter the amount you want to withdraw:");
		amount=sc.nextLong();
		if(balance>=amount) {
			balance=balance-amount;
			System.out.println("Withdrawal is successfull...");
			System.out.println("Balance after withdrawal:"+balance);
		}else {
			System.out.println("Your balance is less than"+amount+"\t Transaction failed...!!");		
		}
	}
	public boolean search(String acc_no) {
		if(account_no.equals(acc_no)) {
			showAccount();
			return(true);
		}
		return(false);
	}
}
