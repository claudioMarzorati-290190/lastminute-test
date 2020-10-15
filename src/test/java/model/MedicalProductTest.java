package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class MedicalProductTest {

    @Test
    void shouldGetCorrectTaxRate() {
        MedicalProduct bookElement = new MedicalProduct("Headache pills", BigDecimal.ONE, 1, false);
        Assertions.assertEquals(BigDecimal.ZERO, bookElement.getTaxRate());
    }
}
