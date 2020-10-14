package model;

import java.math.BigDecimal;

public abstract class GenericGood extends TaxableElement implements IGeneralGood{

    protected String productName;

    protected BigDecimal marketValue;

    protected Integer quantity;

    public GenericGood(String productName, BigDecimal marketValue, Integer quantity){
        this.productName = productName;
        this.marketValue = marketValue;
        this.quantity = quantity;
    }

    public String getProductName(){
        return this.productName;
    }

    public BigDecimal getMarketValue(){
        return this.marketValue;
    }

    public Integer getQuantity(){
        return this.quantity;
    }
}
