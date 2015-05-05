package com.bank.accounts;

public class CurrentAccount extends Account{
	private String accountType;
	private float  caminimumBalance;
	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * @return the caminimumBalance
	 */
	public float getCaminimumBalance() {
		return caminimumBalance;
	}
	/**
	 * @param caminimumBalance the caminimumBalance to set
	 */
	public void setCaminimumBalance(float caminimumBalance) {
		this.caminimumBalance = caminimumBalance;
	}
	
	
}
