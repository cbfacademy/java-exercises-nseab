package com.cbfacademy.accounts;
public class SavingsAccount extends Account{
    private double interestRate=0.05;
    
    public SavingsAccount(int balance, int accountNumber){
        super(balance, accountNumber);

    }
        public void addInterest()
        
        {
            this.balance = (int) (balance*(1+interestRate));
        }

}
