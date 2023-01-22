package encapsulation;

public class Account {
    private int accountNo;
    private String accountHolder;
    private double balance;

    public int getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
class AccountImpl{
    public static void main(String[] args) {
        Account account=new Account();
        account.setAccountNo(452478101);
        account.setAccountHolder("Vaibhav");
        account.setBalance(2244592d);
        System.out.println("Account No : "+ account.getAccountNo());
        System.out.println("Account Holder : "+ account.getAccountHolder());
        System.out.println("Account Balance : "+ account.getBalance());
    }
}
