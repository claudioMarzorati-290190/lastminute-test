package abs;


import java.math.BigDecimal;

public abstract class GenericGood extends TaxableElement {

    protected String productName;

    protected BigDecimal marketValue;

    protected Integer quantity;

    protected Boolean imported;

    public GenericGood(String productName, BigDecimal marketValue, Integer quantity, Boolean imported) {
        this.productName = productName;
        this.marketValue = marketValue;
        this.quantity = quantity;
        this.imported = imported;
    }

    public String getProductName() {
        return this.productName;
    }

    public BigDecimal getMarketValue() {
        return this.marketValue;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public BigDecimal getImportDuty() {
        if (Boolean.TRUE.equals(imported)) {
            return BigDecimal.valueOf(5);
        } else {
            return BigDecimal.ZERO;
        }
    }
}
