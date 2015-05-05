package com.bank.accounts;

public class SavingAccount extends Account{
  //private String accountType;
  private float  saminimumBalance;
  private float  interestRate;
/**
 * @return the saminimumBalance
 */
public float getSaminimumBalance() {
	return saminimumBalance;
}
/**
 * @param saminimumBalance the saminimumBalance to set
 */
public void setSaminimumBalance(float saminimumBalance) {
	this.saminimumBalance = saminimumBalance;
}
/**
 * @return the interestRate
 */
public float getInterestRate() {
	return interestRate;
}
/**
 * @param interestRate the interestRate to set
 */
public void setInterestRate(float interestRate) {
	this.interestRate = interestRate;
}

}
