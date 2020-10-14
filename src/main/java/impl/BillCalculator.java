package impl;

import javax.validation.constraints.NotNull;

import exceptions.LastMinuteException;
import model.GenericGood;
import model.MedicalElement;
import utils.CalculatorUtils;

import java.math.BigDecimal;
import java.util.List;

public class BillCalculator {

    /**
     * This method is used to calculate the tax amount for any good
     * Tax amount are calculated by add the Import Duty Tax to Product-specific tax
     * @param good The good class
     * @return Tax amount
     */
    protected BigDecimal getTaxesAmountForGood(@NotNull GenericGood good){
        return good.getTaxRateForProduct().add(good.getTaxRate());
    }

    /**
     * This method is used to calculate the amount price for any good
     * The amount are calculated by adding marketValue (or price without taxes) to taxes itself
     * @param good The good class
     * @return Amount price
     */
    protected BigDecimal getTotalAmountForProduct(@NotNull GenericGood good){
        BigDecimal goodValue = good.getMarketValue();
        BigDecimal taxesAmount = CalculatorUtils.percentage(goodValue, getTaxesAmountForGood(good));
        return goodValue.add(taxesAmount);
    }

    /**
     * This method calculate the amount price for any good by its quantity
     * @param good  The good class
     * @return Total amount price
     */
    protected BigDecimal getTotalAmountForProductsByQuantiy(@NotNull GenericGood good) {
        return getTotalAmountForProduct(good).multiply(BigDecimal.valueOf(good.getQuantity()));
    }

    /**
     * This method calculate the total amount for a list of any good
     * @param genericGoodList the good list
     * @return Total amount price for a list of goods
     */

    public BigDecimal getTotalAmountForGoodsList(List<GenericGood> genericGoodList){
        BigDecimal result = BigDecimal.ZERO;
        for (GenericGood genericGood : genericGoodList) {
            result = result.add(getTotalAmountForProductsByQuantiy(genericGood));
        }
        return  result;
    }

    /**
     * This method calculate the total taxes amount for a list of any good
     * @param genericGoodList the good list
     * @return Total amount taxes for a list of goods
     */
    public BigDecimal getTotalTaxesAmountForGoodList(List<GenericGood> genericGoodList){
        BigDecimal result = BigDecimal.ZERO;
        for (GenericGood genericGood : genericGoodList) {
            result = result.add(getTaxesAmountForGood(genericGood));
        }
        return result;
    }
}
