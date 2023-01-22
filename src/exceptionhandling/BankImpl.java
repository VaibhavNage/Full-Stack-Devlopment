package exceptionhandling;

import java.util.Scanner;

class SBI{
    double amount = 10000;

    double checkBalance(){
        return amount;
    }
    void deposit(double depositAmount)throws InvalidAmountException {
        if (depositAmount <= 0){
            throw new InvalidAmountException("Invalid Amount");
        }else {
            amount += depositAmount;
            System.out.println("Balance: " + amount);
        }
    }

    void withDraw(double withdrawAmount)throws InsufficientBalanceException {
        if (amount < withdrawAmount) {
            throw new  InsufficientBalanceException("Insufficient Balance");
        } else {
            amount -= withdrawAmount;
            System.out.println("Remaining Balance: " + amount);
        }
    }
}

public class BankImpl {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.println("Enter");
            ch= sc.nextInt();
            switch (ch) {
                case 1:
                try {
                    System.out.println("Enter Amount For Deposit");
                    double deposit= sc.nextDouble();
                    sbi.deposit(deposit);
                } catch (InvalidAmountException e) {
                    System.out.println(e.getMessage());
                }
                    break;
                case 2:
                try {
                    System.out.println("Enter Amount For Withdraw");
                    double withdraw=sc.nextDouble();
                    sbi.withDraw(withdraw);
                } catch (InsufficientBalanceException e) {
                    System.out.println(e.getMessage());
                }
                    break;
                case 3:
                    System.out.println(sbi.checkBalance());
                    break;
                case 4:System.exit(0);
                    break;
                default:
                    System.out.println("Wrong NUmber Try Again");
            }
        }while (ch<5);
    }
}
