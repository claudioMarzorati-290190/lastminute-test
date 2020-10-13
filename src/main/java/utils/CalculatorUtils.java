package utils;

import impl.BillCalculator;
import model.MedicalElement;

import java.math.BigDecimal;

public class CalculatorUtils {

    private CalculatorUtils(){
        throw new IllegalStateException("Utility Class");
    }

    protected static final BigDecimal ONE_HUNDRED = new BigDecimal(100);

    public static BigDecimal percentage(BigDecimal base, BigDecimal pct){
        return base.multiply(pct).divide(ONE_HUNDRED);
    }
}
