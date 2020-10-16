package abs;


import java.math.BigDecimal;

/**
 * This abstract class is a generic representation of all type of data in this test
 * Every new Product should extends this Class and, eventually, overrides getTaxRate()
 */
public abstract class GenericGood {

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

    public BigDecimal getTaxRate() {
        return BigDecimal.valueOf(10);
    }
}
