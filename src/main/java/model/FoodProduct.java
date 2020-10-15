package model;

import abs.GenericGood;

import java.math.BigDecimal;

/**
 * This class represents any food product whether imported or not
 */
public class FoodProduct extends GenericGood {

    public FoodProduct(String productName, BigDecimal marketValue, Integer quantity, Boolean imported) {
        super(productName, marketValue, quantity, imported);
    }

    @Override
    public BigDecimal getTaxRate() {
        return BigDecimal.ZERO;
    }
}
