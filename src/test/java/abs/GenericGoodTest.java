package abs;

import model.GeneralProduct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class GenericGoodTest {

    @Test
    void shouldReturnCorrectImportDuty() {
        GeneralProduct bookElement = new GeneralProduct("Computer", BigDecimal.valueOf(14), 1, true);
        Assertions.assertEquals(BigDecimal.valueOf(5), bookElement.getImportDuty());

        bookElement = new GeneralProduct("Computer", BigDecimal.TEN, 1, false);
        Assertions.assertEquals(BigDecimal.ZERO, bookElement.getImportDuty());
    }
}
