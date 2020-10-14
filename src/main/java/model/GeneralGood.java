package model;

import java.math.BigDecimal;

public class GeneralGood extends GenericGood{

    public GeneralGood(String productName, BigDecimal marketValue, Integer quantity){
        super(productName, marketValue, quantity);
    }

    public BigDecimal getTaxRateForProduct() {
        return BigDecimal.TEN;
    }

}
