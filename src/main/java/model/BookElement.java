package model;

import java.math.BigDecimal;

public class BookElement extends GenericGood {

    public BookElement(BigDecimal marketValue) {
        super(marketValue);
    }

    public BigDecimal getTaxRateForProduct() {
        return BigDecimal.ZERO;
    }
}
