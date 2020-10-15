package model;

import abs.GenericGood;

import java.math.BigDecimal;

/**
 * This class represents any book product whether imported or not
 */
public class BookProduct extends GenericGood {

    public BookProduct(BigDecimal marketValue, Integer quantity, Boolean imported) {
        super("book", marketValue, quantity, imported);
    }

    @Override
    public BigDecimal getTaxRate() {
        return BigDecimal.ZERO;
    }
}
