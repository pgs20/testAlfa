package card;

public class CashbackCreditCard extends CreditCard {
    private final double PERCENT_CASHBACK = 0.05;
    private final double SPENDING = 5000;
    private double cashback;
    public CashbackCreditCard(double balance, double creditLimit) {
        super(balance, creditLimit);
        this.cashback = 0;
    }

    @Override
    public boolean pay(double amount) {
        boolean result = super.pay(amount);
        if (result && amount > SPENDING)
            cashback += amount * PERCENT_CASHBACK;
        return result;
    }

    @Override
    public String getAvailableFunds() {
        return super.getAvailableFunds() + "\n"
                + "Кэшбэк: " + this.cashback;
    }
}
