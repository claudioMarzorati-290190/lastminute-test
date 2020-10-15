package impl;

import abs.GenericGood;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.CalculatorUtils;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.List;


/**
 * This class should do all calculation required for the test
 */
public class BillCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BillCalculator.class);

    /**
     * This method is used to calculate the tax amount for any good
     * Tax amount are calculated by add the Import Duty Tax to Product-specific tax
     *
     * @param good The good class
     * @return Tax amount
     */
    protected BigDecimal getTaxesAmountForGood(@NotNull GenericGood good) {
        BigDecimal taxAmount = good.getImportDuty().add(good.getTaxRate());
        return CalculatorUtils.percentage(good.getMarketValue(), taxAmount);
    }

    /**
     * This method is used to calculate the amount price for any good
     * The amount are calculated by simply return the marketValue
     * @param good The good class
     * @return Amount price
     */
    protected BigDecimal getTotalAmountForProduct(@NotNull GenericGood good){
        BigDecimal goodValue = good.getMarketValue();
        BigDecimal taxesAmount = getTaxesAmountForGood(good);
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
    public BigDecimal getTotalTaxesAmountForGoodList(List<GenericGood> genericGoodList) {
        BigDecimal result = BigDecimal.ZERO;
        for (GenericGood genericGood : genericGoodList) {
            result = result.add(getTaxesAmountForGood(genericGood).multiply(BigDecimal.valueOf(genericGood.getQuantity())));
        }
        return result;
    }

    /**
     * This method just prints the single element on bill
     *
     * @param good
     */
    public void printSingleBillElement(GenericGood good) {
        logger.info(MessageFormat.format("{0} {1} : {2}", good.getQuantity(), good.getProductName(), good.getMarketValue()));
    }

    /**
     * This method prints the row "sales taxes" on bill
     *
     * @param genericGoods
     */
    public void printSalesTax(List<GenericGood> genericGoods) {
        logger.info(MessageFormat.format("Sales Taxes: {0}", getTotalTaxesAmountForGoodList(genericGoods)));
    }

    /**
     * This method prints the total amount (calculated by market value + all taxes) in a bill
     *
     * @param genericGoods
     */
    public void printTotalAmount(List<GenericGood> genericGoods) {
        logger.info(MessageFormat.format("Total: {0}", getTotalAmountForGoodsList(genericGoods)));
    }
}
