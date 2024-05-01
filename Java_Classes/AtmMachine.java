package com.Java_Classes;

class Account{
    private int balance =6000;
    public int getBalance(){
        return balance;
    }
    public void withDraw(int amount){
        balance =balance-amount;
    }
}
class AccountHolder implements Runnable{
    private Account account;
    public AccountHolder(Account account)
    {
        this.account=account;
    }
    public void run(){
        for(int i=1;i<=4;i++){
            makeWithDraw(2000);
            if(account.getBalance()<1){
                System.out.println("Amount has been Over WithDraw");
            }
        }
    }
    public synchronized void makeWithDraw(int amount){
        if(account.getBalance()>=amount){
            System.out.println("Amount Request By " +Thread.currentThread().getName()+ " is successful");
            account.withDraw(amount);
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                e.printStackTrace();
                System.out.println("Thread Got Interrupted");
            }
        }else{
            System.out.println("Not enough amount in account for " +Thread.currentThread().getName() +" to withDrawInAvailable Balance =" + account.getBalance());
        }

    }
}
public class AtmMachine {
    public static void main(String[] args) {
        Account a=new Account();
        AccountHolder h=new AccountHolder(a);
        Thread t1=new Thread(h,"Yogi");
        Thread t2=new Thread(h,"Vansh");
        t1.start();
        t2.start();
    }
}
