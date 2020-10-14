package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class BookElementTest {

    @Test
    public void shouldGetCorrectProductName() {
        BookElement bookElement = new BookElement(BigDecimal.ONE, 1, false);
        Assertions.assertEquals("book", bookElement.getProductName());
    }

    @Test
    public void shouldGetCorrectTaxRateForBooks() {
        BookElement bookElement = new BookElement(BigDecimal.ONE, 1, false);
        Assertions.assertEquals(BigDecimal.ZERO, bookElement.getTaxRate());
    }


}
