package model;

import java.math.BigDecimal;

public class FoodElement extends GenericGood{

    public FoodElement(String productName, BigDecimal marketValue, Integer quantity){
        super(productName, marketValue, quantity);
    }

    public BigDecimal getTaxRateForProduct() {
        return BigDecimal.ZERO;
    }
}
