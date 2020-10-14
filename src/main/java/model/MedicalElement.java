package model;

import java.math.BigDecimal;

public class MedicalElement extends GenericGood{

    public MedicalElement(String productName, BigDecimal marketValue, Integer quantity){
        super(productName, marketValue, quantity);
    }

    public BigDecimal getTaxRateForProduct() {
        return BigDecimal.ZERO;
    }
}
