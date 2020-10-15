package utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static utils.CalculatorUtils.ONE_HUNDRED;

public class CalculatorUtilsTest {

    @Test
    public void shouldCalculateCorrectPercentage() {
        Assertions.assertEquals(Double.valueOf(10), CalculatorUtils.percentage(ONE_HUNDRED, BigDecimal.TEN).doubleValue());
    }

    @Test
    public void shouldRoundCorrectly() {
        Assertions.assertEquals(BigDecimal.TEN, CalculatorUtils.round(BigDecimal.TEN, BigDecimal.ZERO, RoundingMode.UP));

        Assertions.assertEquals(BigDecimal.valueOf(0.9).setScale(2), CalculatorUtils.round(BigDecimal.valueOf(0.86), BigDecimal.valueOf(0.05), RoundingMode.UP));
    }

}
