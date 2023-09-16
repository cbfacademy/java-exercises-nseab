package com.cbfacademy.accounts;
public class CurrentAccount extends Account{
    private int overdraftLimit=-200;
    
    public CurrentAccount(int balance, int accountNumber){
        super(balance, accountNumber);

    }
        public void overdraftChecker()
        {
            if (this.balance<= overdraftLimit){
                System.out.println("overdraft limit reached");
            }
            else{
                System.out.println("");
            }

        }
    }