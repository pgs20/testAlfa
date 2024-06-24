import card.BankCard;
import card.CreditCard;
import card.DebitCard;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(0, 10_000);
        System.out.println(creditCard.getAvailableFunds());
        creditCard.topUpBalance(5000);
        System.out.println(creditCard.pay(3000));
        System.out.println(creditCard.getAvailableFunds());
        System.out.println(creditCard.pay(5000));
        System.out.println(creditCard.getAvailableFunds());
        creditCard.topUpBalance(2000);
        creditCard.topUpBalance(2000);

        DebitCard debitCard = new DebitCard(10000);
        debitCard.pay(1000);
        System.out.println(debitCard.getAvailableFunds());
    }
}
