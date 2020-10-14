package model;

import abs.GenericGood;

import java.math.BigDecimal;

public class FoodElement extends GenericGood {

    public FoodElement(String productName, BigDecimal marketValue, Integer quantity, Boolean imported) {
        super(productName, marketValue, quantity, imported);
    }

    @Override
    public BigDecimal getTaxRate() {
        return BigDecimal.ZERO;
    }
}
