package com.sreeyaprojectapplication.ProjectApplication;

import java.util.Scanner;

public class Banking{
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many number of customers do you want to input?");
		int n=sc.nextInt();
		BankDetails C[]=new BankDetails[n];
		for(int i=0;i<C.length;i++) {
			C[i]=new BankDetails();
			C[i].openAccount();
		}
		int ch;
		do {
			System.out.println("\n***Banking System Application***");
			System.out.println(" 1. Display all account details "
					+ "\n 2. Search by Account number\n "
					+ "3. Deposit the amount \n 4. Withdraw the amount \n 5. Update account details \n 6.Exit ");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				for(int i=0;i<C.length;i++) {
					C[i].showAccount();
				}
				break;
			case 2:
				System.out.println("Enter account number you want to search:");
				String acc_no=sc.next();
				boolean found=false;
				for(int i=0;i<C.length;i++) {
					found=C[i].search(acc_no);
					if(found) {
						break;
					}
				}
				if(!found) {
					System.out.println("Search faild! Account doesn't exist..!!");
				}
				break;
			case 3:
				System.out.println("Enter Account number:");
				acc_no=sc.next();
				found=false;
				for(int i=0;i<C.length;i++) {
					found=C[i].search(acc_no);
					if(found) {
						C[i].deposit();
						System.out.println("Deposite succesfull....");
						break;
					}
				}
				if(!found) {
					System.out.println("Search failed Account doesn't exist..!!");
				}
				
				break;
			case 4:
				System.out.println("Enter Account number:");
				acc_no=sc.next();
				found=false;
				for(int i=0;i<C.length;i++) {
					found=C[i].search(acc_no);
					if(found) {
						C[i].withdrawal();
						break;
					}
				}
				if(!found) {
					System.out.println("Search failed Acoount doesn't exist..!!");				
				}
				break;
			case 5:
				System.out.println("Enter account number you want to search:");
				acc_no=sc.next();
				boolean found1=false;
				for(int i=0;i<C.length;i++) {
					found1=C[i].search(acc_no);
					if(found1) {
						C[i].updateDetails();
						break;
					}
				}
				if(!found1) {
					System.out.println("Search failed Acoount doesn't exist..!!");
					
				}
				break;
				
			case 6:
				System.out.println("Thank you..:-)");
				break;
			
			}
		}
		while(ch!=6);
	}
 }
 