public class BankAccount {

    public String owner;
    private double balance;
    protected int age;

    public double getBalance() {
        return this.balance;


    }

    public void deposit(double dollars) {
        balance = balance + dollars;


    }

    public void withdraw(double dollars) {
        System.out.println();


    }

    protected void setBalance(double dollars) {
        this.balance = dollars;

    }

    protected void transfer(BankAccount other, double amount) {
        System.out.println("HI");


    }

    private String getOwner() {
        return owner;


    }

}