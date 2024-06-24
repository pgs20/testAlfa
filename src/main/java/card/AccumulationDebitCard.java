package card;

public class AccumulationDebitCard extends DebitCard {
    private final double ACCUMULATION_BONUS = 0.005;
    private double accumulation;
    public AccumulationDebitCard(double balance) {
        super(balance);
        this.accumulation = 0;
    }

    @Override
    public void topUpBalance(double amount) {
        super.topUpBalance(amount);
        this.accumulation += amount * ACCUMULATION_BONUS;
    }

    @Override
    public String getAvailableFunds() {
        return super.getAvailableFunds() + "\n"
                + "Накопление от пополнений: " + this.accumulation;
    }
}
