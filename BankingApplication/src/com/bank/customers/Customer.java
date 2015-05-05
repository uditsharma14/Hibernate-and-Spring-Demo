package com.bank.customers;

import com.bank.accounts.Account;

public class Customer{
  private String customerID;
  private String customerName;
  private String customerAddress;
  private String dateofBirth;
  private String contactNumber;
  private Account account;
  
 /**
 * @return the account
 */
public Account getAccount() {
	return account;
}
/**
 * @param accout the account to set
 */
public void setAccount(Account account) {
	this.account = account;
}
/**
 * @return the customerID
 */
public String getCustomerID() {
	return customerID;
}
/**
 * @param customerID the customerID to set
 */
public void setCustomerID(String customerID) {
	this.customerID = customerID;
}
/**
 * @return the customerName
 */
public String getCustomerName() {
	return customerName;
}
/**
 * @param customerName the customerName to set
 */
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
/**
 * @return the customerAddress
 */
public String getCustomerAddress() {
	return customerAddress;
}
/**
 * @param customerAddress the customerAddress to set
 */
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
/**
 * @return the dateofBirth
 */
public String getDateofBirth() {
	return dateofBirth;
}
/**
 * @param dateofBirth the dateofBirth to set
 */
public void setDateofBirth(String dateofBirth) {
	this.dateofBirth = dateofBirth;
}
/**
 * @return the contactNumber
 */
public String getContactNumber() {
	return contactNumber;
}
/**
 * @param contactNumber the contactNumber to set
 */
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}
  
}
