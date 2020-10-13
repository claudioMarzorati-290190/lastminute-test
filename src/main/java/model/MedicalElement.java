package model;

import java.math.BigDecimal;

public class MedicalElement extends GenericGood{

    public MedicalElement(BigDecimal marketValue) {
        super(marketValue);
    }

    public BigDecimal getTaxRateForProduct() {
        return BigDecimal.ZERO;
    }
}
