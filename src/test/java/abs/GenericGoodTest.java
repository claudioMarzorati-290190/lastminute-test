package abs;

import model.GeneralGood;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class GenericGoodTest {

    @Test
    void shouldReturnCorrectImportDuty() {
        GeneralGood bookElement = new GeneralGood("Computer", BigDecimal.valueOf(14), 1, true);
        Assertions.assertEquals(BigDecimal.valueOf(5), bookElement.getImportDuty());

        bookElement = new GeneralGood("Computer", BigDecimal.TEN, 1, false);
        Assertions.assertEquals(BigDecimal.ZERO, bookElement.getImportDuty());
    }
}
