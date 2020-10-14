package impl;

import abs.GenericGood;
import model.GeneralGood;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BillCalculatorTest {

    BillCalculator billCalculator = new BillCalculator();

    @Test
    public void shouldGetCorrectTaxesAmountForGood() {
        GenericGood generalGood = new GeneralGood("COMPUTER", new BigDecimal(100), 1, true);
        Assertions.assertEquals(new BigDecimal(15), billCalculator.getTaxesAmountForGood(generalGood));

        generalGood = new GeneralGood("COMPUTER", new BigDecimal(100), 1, false);
        Assertions.assertEquals(BigDecimal.TEN, billCalculator.getTaxesAmountForGood(generalGood));
    }

    @Test
    public void shouldGetCorrectTotalAmountForGood() {
        GenericGood generalGood = new GeneralGood("COMPUTER", new BigDecimal(100), 1, true);
        Assertions.assertEquals(new BigDecimal(115), billCalculator.getTotalAmountForProduct(generalGood));

        generalGood = new GeneralGood("COMPUTER", new BigDecimal(100), 1, false);
        Assertions.assertEquals(new BigDecimal(110), billCalculator.getTotalAmountForProduct(generalGood));
    }

    @Test
    public void shouldGetCorrectTotalAmountForGoodByQuantity() {
        GenericGood generalGood = new GeneralGood("COMPUTER", new BigDecimal(100), 2, true);
        Assertions.assertEquals(new BigDecimal(230), billCalculator.getTotalAmountForProductsByQuantiy(generalGood));

        generalGood = new GeneralGood("COMPUTER", new BigDecimal(100), 2, false);
        Assertions.assertEquals(new BigDecimal(220), billCalculator.getTotalAmountForProductsByQuantiy(generalGood));
    }

    @Test
    public void shouldGetTotalAmountForGoodsList() {
        GenericGood generalGood = new GeneralGood("COMPUTER", new BigDecimal(100), 2, true);
        GenericGood generalGood2 = new GeneralGood("MAC_APPLE", new BigDecimal(100), 2, true);

        List<GenericGood> goods = new ArrayList<>();
        goods.add(generalGood);
        goods.add(generalGood2);
        Assertions.assertEquals(new BigDecimal(460), billCalculator.getTotalAmountForGoodsList(goods));
    }

    @Test
    public void shouldGetTotalTaxesAmountForGoodList() {
        GenericGood generalGood = new GeneralGood("COMPUTER", new BigDecimal(100), 2, true);
        GenericGood generalGood2 = new GeneralGood("MAC_APPLE", new BigDecimal(100), 2, true);

        List<GenericGood> goods = new ArrayList<>();
        goods.add(generalGood);
        goods.add(generalGood2);

    }

}
