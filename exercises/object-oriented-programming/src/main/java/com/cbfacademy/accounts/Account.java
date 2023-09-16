package com.cbfacademy.accounts;

public class Account{
    protected int balance;
    protected int accountNumber;

    public Account(int balance, int accountNumber)
    {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public Account(int accountNumber)
    {
        this.balance = 0;
        this.accountNumber = accountNumber;
    }

    public void deposit(int number)
    {
        balance +=number;
    }
   
    public int withdraw(int number)
    {
        int withdrawalAmount = Math.abs(number);
        if(balance>= withdrawalAmount)
        {
            balance -= withdrawalAmount;
            return withdrawalAmount;

        }
        else {
        System.out.println("Insufficient funds!");
        return 0;
    }

    }


}

