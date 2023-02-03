package multithreading;

import packages.p2.B;

public class BankTransaction {
    int balance=1000;
    synchronized void withdrawn(int amount){
        System.out.println("in withdrawn method");
        if (balance>=amount){
            balance = balance-amount;
            System.out.println("Remaining balance "+balance);
        }else {
            System.out.println("Waiting for deposit");
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            balance = balance - amount;
            System.out.println("Amount withdrawn: "+balance);
            System.out.println("Transaction complete");
        }
    }
    synchronized void deposit(int amount){
        System.out.println("in deposit method");
        balance = balance+amount;
        System.out.println("Updated Balance: "+balance);
        notify();
    }
}
class BankTransactionImpl{
    public static void main(String[] args) {
        BankTransaction bankTransaction=new BankTransaction();
        BankThread1 bt1=new BankThread1(bankTransaction);
        BankThread2 bt2=new BankThread2(bankTransaction);
        bt1.start();
        bt2.start();
    }
}
class BankThread1 extends Thread{
    BankTransaction bankTransaction;
    BankThread1(BankTransaction bankTransaction){
        this.bankTransaction=bankTransaction;
    }
    @Override
    public void run(){
        bankTransaction.withdrawn(2000);
    }
}
class BankThread2 extends Thread{
    BankTransaction bankTransaction;
    BankThread2(BankTransaction bankTransaction){
        this.bankTransaction=bankTransaction;
    }
    @Override
    public void run(){
        bankTransaction.deposit(3000);
    }
}