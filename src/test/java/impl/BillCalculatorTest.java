package impl;

import abs.GenericGood;
import model.GeneralProduct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BillCalculatorTest {

    BillCalculator billCalculator = new BillCalculator();

    @Test
    public void shouldGetCorrectTaxesAmountForGood() {
        GenericGood generalGood = new GeneralProduct("COMPUTER", new BigDecimal(100), 1, true);
        Assertions.assertEquals(new BigDecimal(15).setScale(2), billCalculator.getTaxesAmountForGood(generalGood));

        generalGood = new GeneralProduct("COMPUTER", new BigDecimal(100), 1, false);
        Assertions.assertEquals(BigDecimal.TEN.setScale(2), billCalculator.getTaxesAmountForGood(generalGood));
    }

    @Test
    public void shouldGetCorrectTotalAmountForGood() {
        GenericGood generalGood = new GeneralProduct("COMPUTER", new BigDecimal(100), 1, true);
        Assertions.assertEquals(new BigDecimal(115).setScale(2), billCalculator.getTotalAmountForProduct(generalGood));

        generalGood = new GeneralProduct("COMPUTER", new BigDecimal(100), 1, false);
        Assertions.assertEquals(new BigDecimal(110).setScale(2), billCalculator.getTotalAmountForProduct(generalGood));
    }

    @Test
    public void shouldGetCorrectTotalAmountForGoodByQuantity() {
        GenericGood generalGood = new GeneralProduct("COMPUTER", new BigDecimal(100), 2, true);
        Assertions.assertEquals(new BigDecimal(230).setScale(2), billCalculator.getTotalAmountForProductsByQuantiy(generalGood));

        generalGood = new GeneralProduct("COMPUTER", new BigDecimal(100), 2, false);
        Assertions.assertEquals(new BigDecimal(220).setScale(2), billCalculator.getTotalAmountForProductsByQuantiy(generalGood));
    }

    @Test
    public void shouldGetTotalAmountForGoodsList() {
        GenericGood generalGood = new GeneralProduct("COMPUTER", new BigDecimal(100), 2, true);
        GenericGood generalGood2 = new GeneralProduct("MAC_APPLE", new BigDecimal(100), 2, true);

        List<GenericGood> goods = new ArrayList<>();
        goods.add(generalGood);
        goods.add(generalGood2);
        Assertions.assertEquals(new BigDecimal(460).setScale(2), billCalculator.getTotalAmountForGoodsList(goods));
    }

    @Test
    public void shouldGetTotalTaxesAmountForGoodList() {
        GenericGood generalGood = new GeneralProduct("COMPUTER", new BigDecimal(100), 2, true);
        GenericGood generalGood2 = new GeneralProduct("MAC_APPLE", new BigDecimal(100), 2, true);

        List<GenericGood> goods = new ArrayList<>();
        goods.add(generalGood);
        goods.add(generalGood2);

        Assertions.assertEquals(new BigDecimal(60).setScale(2), billCalculator.getTotalTaxesAmountForGoodList(goods));
    }

}
