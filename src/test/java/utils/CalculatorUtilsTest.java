package utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static utils.CalculatorUtils.ONE_HUNDRED;

public class CalculatorUtilsTest {

    @Test
    public void shouldCalculateCorrectPercentage() {
        Assertions.assertEquals(BigDecimal.TEN, CalculatorUtils.percentage(ONE_HUNDRED, BigDecimal.TEN));
    }

}
