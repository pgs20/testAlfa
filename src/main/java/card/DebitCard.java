package card;

public class DebitCard extends BankCard {
    public DebitCard(double balance) {
        super(balance);
        System.out.println("Дебетовая карта с " + this.balance);
    }

    @Override
    public String getAvailableFunds() {
        return "Средства дебетовой карты: " + this.balance;
    }

    public void topUpBalance(double amount) {
        if (amount < 0)
            return;
        this.balance += amount;
    }
}
