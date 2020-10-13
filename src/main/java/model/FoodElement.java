package model;

import java.math.BigDecimal;

public class FoodElement extends GenericGood{

    public FoodElement(BigDecimal marketValue) {
        super(marketValue);
    }

    public BigDecimal getTaxRateForProduct() {
        return BigDecimal.ZERO;
    }
}
