public class BankAccount {
    private String accountHolder;
    private double balance;
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount) {
// TODO: add the amount to the balance
    if (amount > 0) {
        balance += amount;

    }   
    }

    public boolean withdraw(double amount) {
// TODO:
// Withdraw the requested amount if sufficient funds are available.
// Return true if the withdrawal succeeds.
// Return false otherwise. return false;
        balance -= amount + 2.00;
    if ( amount <= balance && balance >= 50.00 ) {
        return true;
    } else {
        balance += amount + 2.00;
    }

    return false;
    
    }
    public String getAccountSummary() {
        return accountHolder + ": $" + balance;
    }

public static void main(String[] args){
    BankAccount acct = new BankAccount ("Osagie Akhagba",100.00 );
    acct.deposit(50.00);
    acct.withdraw(50.00);


    System.out.println(acct.getAccountSummary());  

    System.out.println(acct.withdraw(90.00));       
    System.out.println(acct.getAccountSummary());

    System.out.println(acct.withdraw(500.00));      
    System.out.println(acct.getAccountSummary());





}

}