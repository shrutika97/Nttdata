package com.bankAssignment;

public class Account {
    
    private int accountId;
    private double accountBalance;
    public Account(int accountId, double accountBalance) {
        super();
        this.accountId = accountId;
        this.accountBalance = accountBalance;
    }
    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    
}
 
