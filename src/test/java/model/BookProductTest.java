package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class BookProductTest {

    @Test
    public void shouldGetCorrectProductName() {
        BookProduct bookProduct = new BookProduct(BigDecimal.ONE, 1, false);
        Assertions.assertEquals("book", bookProduct.getProductName());
    }

    @Test
    public void shouldGetCorrectTaxRateForBooks() {
        BookProduct bookProduct = new BookProduct(BigDecimal.ONE, 1, false);
        Assertions.assertEquals(BigDecimal.ZERO, bookProduct.getTaxRate());
    }


}
