package model;

import abs.GenericGood;

import java.math.BigDecimal;

public class BookElement extends GenericGood {

    public BookElement(BigDecimal marketValue, Integer quantity, Boolean imported) {
        super("book", marketValue, quantity, imported);
    }

    @Override
    public BigDecimal getTaxRate() {
        return BigDecimal.ZERO;
    }
}
