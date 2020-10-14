package model;

import java.math.BigDecimal;

public class BookElement extends GenericGood {

    public BookElement(BigDecimal marketValue, Integer quantity){
        super( "book", marketValue, quantity);
    }

    public BigDecimal getTaxRateForProduct() {
        return BigDecimal.ZERO;
    }
}
