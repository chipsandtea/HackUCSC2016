package com.example.christopher.ome;

/**
 * Created by Christopher on 1/29/16.
 */
public class Member {

    private int memberID;
    private double balance;
    private String memberName;

    public Member(int memID, String memName, double initBalance){
        memberID = memID;
        memberName = memName;
        balance = initBalance;
    }

    public int getID(){
        return memberID;
    }

    //returns new balance, or -1 if amount added is negative and cannot be completed.
    public double addFunds(double funds){
        if(funds >= 0){
            balance += funds;
            return balance;
        }else{
            return -1;
        }
    }

    //returns new balance, or -1 if they'll go over and cancels the transaction.
    public double makePayment(double paymentAmount){
        if(paymentAmount > balance){
            return -1;
        }else{
            balance -= paymentAmount;
            return balance;
        }
    }

    public double getBalance(){
        return balance;
    }

    public String getMemberName(){
        return memberName;
    }
}
