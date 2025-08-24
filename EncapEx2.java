class BankAccount{
    private String accountNum;
    private double balance;

    public BankAccount(String accountNum, double balance){
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public String getAccountNum(){
        return accountNum;
    }

    public double balance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount <+ balance){
            balance -= amount;
        } else{
            System.out.println("Insufficient Amount");
        }
    }
}


public class EncapEx2 {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(5000);
        account.withdraw(3000);

        System.out.println(account.getAccountNum() + " has a balance of " + account.balance());

    }

}
