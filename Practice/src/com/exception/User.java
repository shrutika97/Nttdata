package com.exception;

public class User extends Bank{
	
	private String useName;
	@Override
	public String toString() {
		return "User useName=" + useName + ", userAddress=" + userAddress + ", Account=" + account.getAccountBalance() ;
	}
	public User(String useName, String userAddress, Account account) {
		super();
		this.useName = useName;
		this.userAddress = userAddress;
		this.account = account;
	}
	public String getUseName() {
		return useName;
	}
	public void setUseName(String useName) {
		this.useName = useName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	private String userAddress;
	private Account account;

}
