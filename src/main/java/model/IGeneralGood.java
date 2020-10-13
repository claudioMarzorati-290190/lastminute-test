package model;

import java.math.BigDecimal;

/**
 * This class is a wrapper for all goods served in this application
 */
public interface IGeneralGood {
    /**
     * Use this method to return the basic tax rate for the product
     * @return basic tax rate for the current product
     */
    public BigDecimal getTaxRateForProduct();
}
