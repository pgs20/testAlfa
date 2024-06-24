package cardTest;

import card.CreditCard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditCardTest {
    @Test
    void testTopUpBalance() {
        CreditCard creditCard = new CreditCard(0, 500);
        creditCard.topUpBalance(300);
        Assertions.assertEquals("Кредитные средства: 500.0\nСобственные средства: 300.0", creditCard.getAvailableFunds());
    }

    @Test
    void testPayEnoughBalance() {
        CreditCard creditCard = new CreditCard(500, 500);
        Assertions.assertTrue(creditCard.pay(200));
        Assertions.assertEquals("Кредитные средства: 500.0\nСобственные средства: 300.0", creditCard.getAvailableFunds()); }
}
