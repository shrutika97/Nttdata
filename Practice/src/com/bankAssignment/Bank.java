package com.bankAssignment;

public class Bank {
    
    void greetUser()
    {
        System.out.println("HDFC BANK WELCOMES YOU");
    }
    void transaction(Users user1,Users user2,double amount)
    {
        if(user1.getAccount().getAccountBalance()<amount)
        {
            try {
            throw new InsufficientBalanceAmount("your account balance is low");
            
            
        }
            catch(InsufficientBalanceAmount e) {
                
                e.printStackTrace();
            }
        }
        else
        {
            double uld=user1.getAccount().getAccountBalance()-amount;
            user1.getAccount().setAccountBalance(uld);
            
            double u2w=user2.getAccount().getAccountBalance()+amount;
            user2.getAccount().setAccountBalance(u2w);
            System.out.println(user1);
            System.out.println(user2);
            
        }
    }
}
