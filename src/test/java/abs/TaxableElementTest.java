package abs;

import model.GeneralGood;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class TaxableElementTest {

    @Test
    public void shouldReturnCorrectTaxRate() {
        GeneralGood generalGood = new GeneralGood("COMPUTER", BigDecimal.ONE, 1, false);
        Assertions.assertEquals(BigDecimal.TEN, generalGood.getTaxRate());
    }

}
