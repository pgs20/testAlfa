package card;

public abstract class BankCard {
    protected double balance;
    public BankCard(double balance) {
        this.balance = balance;
    }
    public boolean pay(double amount) {
        if (amount > balance)
            return false;
        balance -= amount;
        return true;
    }
    public abstract String getAvailableFunds();
}
