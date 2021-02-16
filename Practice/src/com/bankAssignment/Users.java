package com.bankAssignment;

public class Users {
    
    Account account;
    String name;
    String address;
    
    
    public Users() {
        
        // TODO Auto-generated constructor stub
    }

 

    public Users(Account acc1, String name1, String address1) {
        this.account=acc1;
        this.name=name1;
        this.address=address1;
    }

 

    public Account getAccount() {
        return account;
    }

 

    public void setAccount(Account account) {
        this.account = account;
    }

 

    public String getName() {
        return name;
    }

 

    public void setName(String name) {
        this.name = name;
    }

 

    public String getAddress() {
        return address;
    }

 

    public void setAddress(String address) {
        this.address = address;
    }

 

    @Override
    public String toString() {
        return "name: "+name+" account balance: "+account.getAccountBalance();
    }

 

    

 

    
    
    

 

}
