package utils;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculatorUtils {

    private CalculatorUtils() {
        throw new IllegalStateException("Utility Class");
    }

    protected static final BigDecimal ONE_HUNDRED = new BigDecimal(100);

    public static BigDecimal percentage(BigDecimal base, BigDecimal pct) {
        return round(pct.multiply(base).divide(ONE_HUNDRED), new BigDecimal(0.05), RoundingMode.UP);
    }

    public static BigDecimal round(BigDecimal value, BigDecimal increment,
                                   RoundingMode roundingMode) {
        if (increment.signum() == 0) {
            // 0 increment does not make much sense, but prevent division by 0
            return value;
        } else {
            BigDecimal divided = value.divide(increment, 0, roundingMode);
            return divided.multiply(increment);
        }
    }


}
