package com.bank.operations;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.accounts.Account;
import com.bank.accounts.CurrentAccount;
import com.bank.accounts.SavingAccount;
import com.bank.customers.Customer;

public class BankingOperations {
	
    private static Scanner sc=new Scanner(System.in);
    
	public Customer openAAccount(){
		ApplicationContext ap=new ClassPathXmlApplicationContext("BankBean.xml");
		Customer customer=null;
		Account accnt=null;
		System.out.println("Enter the Customer ID :");
		String customerId=sc.next();
		System.out.println("Enter the Customer Name :");
		String customerName=sc.next();
		System.out.println("Enter the Customer Date of Birth: ");
		String customerDOB=sc.next();
		System.out.println("Enter the Customer Address: ");
		String customerAddress=sc.next();
		System.out.println("Enter the Customer Contact Information :");
	    String customerContactNo=sc.next();
		System.out.println("Enter the Type of Account Current/Saving :");
		String acctType=sc.next();
		if("Current".equals(acctType)){
			customer=(Customer)ap.getBean("cacustomerbean");
			CurrentAccount caccnt=(CurrentAccount)customer.getAccount();
			System.out.println("Enter the Account Number: ");
			String accountNumber=sc.next();
			caccnt.setAccountNumber(accountNumber);
			System.out.println("Enter the Current Balance: ");
			float currBalance=sc.nextFloat();
			caccnt.setCurrBalance(currBalance);
			System.out.println("Enter the rMinimum Balance: ");
			float minimumBalance=sc.nextFloat();
			caccnt.setCaminimumBalance(minimumBalance);		
		}
		else{
			customer=(Customer)ap.getBean("sacustomerbean");
			SavingAccount saccnt=(SavingAccount)customer.getAccount();
			System.out.println("Enter the Account Number: ");
			String accountNumber=sc.next();
			saccnt.setAccountNumber(accountNumber);
			System.out.println("Enter the Current Balance: ");
			float currBalance=sc.nextFloat();
			saccnt.setCurrBalance(currBalance);
			System.out.println("Enter the rMinimum Balance: ");
			float minimumBalance=sc.nextFloat();
			saccnt.setSaminimumBalance(minimumBalance);
			System.out.println("Enter the Interest Rate:");
			float interestRate=sc.nextByte();
			saccnt.setInterestRate(interestRate);
			
		}
		customer.setCustomerID(customerId);
		customer.setCustomerName(customerName);
		customer.setDateofBirth(customerDOB);
		customer.setCustomerAddress(customerAddress);
		customer.setContactNumber(customerContactNo);
		return customer;
	}
	public void showCustomerInformation(String  customerID){
		
	}
	
	public void showAccountInformation(String AccountID){
		
	}
	
	public int updateAccountInformation(){
		return 0;
	}
	public int deleteAccount(){
		return 0;
	}
	public int updateCustomerInformation(){
		return 0;
	}
	public int deleteCustomerInformation(){
		return 0;
		
	}
}
