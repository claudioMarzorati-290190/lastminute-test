package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class FoodProductTest {

    @Test
    void shouldGetCorrectTaxRate() {
        FoodProduct foodProduct = new FoodProduct("pizza", BigDecimal.ONE, 1, false);
        Assertions.assertEquals(BigDecimal.ZERO, foodProduct.getTaxRate());
    }
}
