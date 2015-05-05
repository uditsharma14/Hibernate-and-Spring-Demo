package com.bank.accounts;

public class Account {
  private String accountNumber;
  private float currBalance;
/**
 * @return the currBalance
 */
public float getCurrBalance() {
	return currBalance;
}

/**
 * @param currBalance the currBalance to set
 */
public void setCurrBalance(float currBalance) {
	this.currBalance = currBalance;
}

/**
 * @return the accountNumber
 */
public String getAccountNumber() {
	return accountNumber;
}

/**
 * @param accountNumber the accountNumber to set
 */
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
  
 }
