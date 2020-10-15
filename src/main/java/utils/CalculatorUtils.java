package utils;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculatorUtils {

    private CalculatorUtils() {
        throw new IllegalStateException("Utility Class");
    }

    protected static final BigDecimal ONE_HUNDRED = new BigDecimal(100);

    public static BigDecimal percentage(BigDecimal base, BigDecimal pct) {
        return round(pct.multiply(base).divide(ONE_HUNDRED), BigDecimal.valueOf(0.05), RoundingMode.UP);
    }

    protected static BigDecimal round(BigDecimal value, BigDecimal increment,
                                      RoundingMode roundingMode) {
        if (increment.signum() == 0) {
            // this prevents division by zero
            return value;
        } else {
            BigDecimal divided = value.divide(increment, 0, roundingMode);
            return divided.multiply(increment);
        }
    }


}
