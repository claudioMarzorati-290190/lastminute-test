package impl;

import javax.validation.constraints.NotNull;

import exceptions.LastMinuteException;
import model.GenericGood;
import utils.CalculatorUtils;

import java.math.BigDecimal;

public class BillCalculator {

    protected BigDecimal getTaxesAmountForGood(@NotNull GenericGood good){
        return good.getTaxRateForProduct().add(good.getTaxRate());
    }

    protected BigDecimal getTotalAmountForProduct(@NotNull GenericGood good){
        BigDecimal goodValue = good.getMarketValue();
        BigDecimal taxesAmount = CalculatorUtils.percentage(goodValue, getTaxesAmountForGood(good));
        return goodValue.add(taxesAmount);
    }

    public BigDecimal getTotalAmountForProductsByQuantiy(@NotNull GenericGood good,Integer number) throws LastMinuteException {
        if(number == null){
            //TODO FIXME
            throw new LastMinuteException("Quantity can't be null");
        }
        return getTotalAmountForProduct(good).multiply(BigDecimal.valueOf(number));
    }
}
