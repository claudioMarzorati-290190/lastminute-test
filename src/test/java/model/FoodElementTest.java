package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class FoodElementTest {

    @Test
    void shouldGetCorrectTaxRate() {
        FoodElement foodElement = new FoodElement("pizza", BigDecimal.ONE, 1, false);
        Assertions.assertEquals(BigDecimal.ZERO, foodElement.getTaxRate());
    }
}
