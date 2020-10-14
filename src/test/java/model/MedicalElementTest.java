package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class MedicalElementTest {

    @Test
    void shouldGetCorrectTaxRate() {
        MedicalElement bookElement = new MedicalElement("Headache pills", BigDecimal.ONE, 1, false);
        Assertions.assertEquals(BigDecimal.ZERO, bookElement.getTaxRate());
    }
}
