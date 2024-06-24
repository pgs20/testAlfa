package card;

public class CreditCard extends BankCard {
    private final double CREDIT_LIMIT_VALUE;
    private double creditLimit;

    public CreditCard(double balance, double creditLimit) {
        super(balance);
        CREDIT_LIMIT_VALUE = creditLimit;
        this.creditLimit = CREDIT_LIMIT_VALUE;
        System.out.println("Кредитная карта с лимитом " + this.creditLimit);
    }

    public void topUpBalance(double amount) {
        if (this.creditLimit != CREDIT_LIMIT_VALUE) {
            if (this.creditLimit + amount >= CREDIT_LIMIT_VALUE) {
                this.balance += this.creditLimit + amount - CREDIT_LIMIT_VALUE;
                this.creditLimit = CREDIT_LIMIT_VALUE;
            } else {
                this.creditLimit += amount;
            }
        } else {
            this.balance += amount;
        }
        System.out.println("После пополнения карты на: " + amount + "\n" + this.getAvailableFunds());
    }

    @Override
    public boolean pay(double amount) {
        if (!super.pay(amount)) {
            if (this.creditLimit > amount) {
                this.creditLimit += this.balance - amount;
                this.balance = 0;
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public String getAvailableFunds() {
        return "Кредитные средства: " + this.creditLimit
                + "\nСобственные средства: " + this.balance;
    }
}
