package model;

import abs.GenericGood;

import java.math.BigDecimal;

/**
 * This class represents any medical product whether imported or not
 */
public class MedicalProduct extends GenericGood {


    public MedicalProduct(String productName, BigDecimal marketValue, Integer quantity, Boolean imported) {
        super(productName, marketValue, quantity, imported);
    }

    @Override
    public BigDecimal getTaxRate() {
        return BigDecimal.ZERO;
    }
}
