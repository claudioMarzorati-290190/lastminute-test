package model;

import java.math.BigDecimal;

public abstract class TaxableElement {
    public BigDecimal getTaxRate(){
        return BigDecimal.valueOf(5);
    }
}
