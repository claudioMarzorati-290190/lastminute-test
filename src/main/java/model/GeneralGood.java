package model;

import abs.GenericGood;

import java.math.BigDecimal;

/**
 * This class rapresents any good that are not Food, Book or Medical
 */
public class GeneralGood extends GenericGood {

    public GeneralGood(String productName, BigDecimal marketValue, Integer quantity, Boolean imported) {
        super(productName, marketValue, quantity, imported);
    }

}
