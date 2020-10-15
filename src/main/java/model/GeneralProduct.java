package model;

import abs.GenericGood;

import java.math.BigDecimal;

/**
 * This class represents any good that are not Food, Book or Medical
 */
public class GeneralProduct extends GenericGood {

    public GeneralProduct(String productName, BigDecimal marketValue, Integer quantity, Boolean imported) {
        super(productName, marketValue, quantity, imported);
    }

}
