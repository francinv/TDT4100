package oving1;

public class Account {
    private double balance;
    private double interestRate;

    public Account (
    ) {
        this.balance = 0.0;
        this.interestRate = 0.0;
    }

    public void deposit(double newValue) {
        if (newValue > 0) {
            this.balance += newValue;
        }
    }

    public void addInterest() {
        this.balance += this.interestRate;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getInterestRate() {
        return  this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate += interestRate;
    }
}
