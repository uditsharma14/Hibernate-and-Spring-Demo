package com.Main;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import com.bank.customers.Customer;
import com.bank.operations.BankingOperations;
import com.hibernateoperation.HibernateOpration;

public class MainClass {
public static void main(String []args){
	try{
   BankingOperations bo=new BankingOperations();
   Customer	customer=bo.openAAccount();
   System.out.println("Customer ID:"+customer.getCustomerID());
   System.out.print("Customer Name:"+customer.getCustomerName());
   
   Session session=HibernateOpration.getSessionFactoryObject().openSession();
   Transaction txn=null;
   txn=session.beginTransaction();
   txn.begin();
   session.save(customer);
   txn.commit();
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		System.out.println("Exception Accured: "+e.getMessage());
	}
   
}
}
