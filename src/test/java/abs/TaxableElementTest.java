package abs;

import model.GeneralProduct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class TaxableElementTest {

    @Test
    public void shouldReturnCorrectTaxRate() {
        GeneralProduct generalProduct = new GeneralProduct("COMPUTER", BigDecimal.ONE, 1, false);
        Assertions.assertEquals(BigDecimal.TEN, generalProduct.getTaxRate());
    }

}
