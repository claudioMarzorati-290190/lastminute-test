package model;

import java.math.BigDecimal;

public abstract class GenericGood extends TaxableElement implements IGeneralGood{

    protected BigDecimal marketValue;

    public GenericGood(BigDecimal marketValue){
        this.marketValue = marketValue;
    }

    public BigDecimal getMarketValue(){
        return marketValue;
    }
}
