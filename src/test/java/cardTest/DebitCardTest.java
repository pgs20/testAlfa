package cardTest;

import card.DebitCard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DebitCardTest {
    @Test
    public void testGetAvailableFunds() {
        DebitCard debitCard = new DebitCard(100.0);
        Assertions.assertEquals("Средства дебетовой карты: 100.0", debitCard.getAvailableFunds());
    }

    @Test
    public void testTopUpBalance() {
        DebitCard debitCard = new DebitCard(100.0);
        debitCard.topUpBalance(50.0);
        Assertions.assertEquals(150.0, debitCard.getBalance());
    }
}
