package model;

import java.math.BigDecimal;

public class GeneralGood extends GenericGood{

    public GeneralGood(BigDecimal marketValue) {
        super(marketValue);
    }

    public BigDecimal getTaxRateForProduct() {
        return BigDecimal.TEN;
    }

}
