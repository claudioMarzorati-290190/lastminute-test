package testresult;

import abs.GenericGood;
import impl.BillCalculator;
import model.BookElement;
import model.FoodElement;
import model.GeneralGood;
import model.MedicalElement;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestResult {

    BillCalculator billCalculator = new BillCalculator();

    private static final Logger logger = LoggerFactory.getLogger(BillCalculator.class);


    @BeforeAll
    public static void startTest() {
        logger.info("***** START TEST CASES ******");
    }

    @AfterAll
    public static void endsTest() {
        logger.info("***** ENDS TEST CASES ******");
    }

    @Test
    public void showResult1() {
        List<GenericGood> genericGoodList = new ArrayList<>();
        BookElement bookElement = new BookElement(BigDecimal.valueOf(12.49), 1, false);
        billCalculator.printSingleBillElement(bookElement);
        GeneralGood musicCd = new GeneralGood("music CD", BigDecimal.valueOf(14.99), 1, false);
        billCalculator.printSingleBillElement(musicCd);
        FoodElement chocolateBar = new FoodElement("chocolate bar", BigDecimal.valueOf(0.85), 1, false);
        billCalculator.printSingleBillElement(chocolateBar);

        genericGoodList.add(bookElement);
        genericGoodList.add(musicCd);
        genericGoodList.add(chocolateBar);
        billCalculator.printSalesTax(genericGoodList);
        billCalculator.printTotalAmount(genericGoodList);
    }

    @Test
    public void showResult2() {
        List<GenericGood> genericGoodList = new ArrayList<>();
        FoodElement importedChocolates = new FoodElement("imported box of chocolates", BigDecimal.TEN, 1, true);
        billCalculator.printSingleBillElement(importedChocolates);
        GeneralGood perfume = new GeneralGood("imported bottle of perfume", BigDecimal.valueOf(47.5), 1, true);
        billCalculator.printSingleBillElement(perfume);

        genericGoodList.add(importedChocolates);
        genericGoodList.add(perfume);
        billCalculator.printSalesTax(genericGoodList);
        billCalculator.printTotalAmount(genericGoodList);
    }

    @Test
    public void showResult3() {
        List<GenericGood> genericGoodList = new ArrayList<>();

        GeneralGood importedbottleOfPerfume = new GeneralGood("imported bottle of perfume", BigDecimal.valueOf(27.99), 1, true);
        billCalculator.printSingleBillElement(importedbottleOfPerfume);

        GeneralGood bottleOfPerfume = new GeneralGood("bottle of perfume", BigDecimal.valueOf(18.99), 1, false);
        billCalculator.printSingleBillElement(bottleOfPerfume);

        MedicalElement headachePills = new MedicalElement("packet of headache pills", BigDecimal.valueOf(9.75), 1, false);
        billCalculator.printSingleBillElement(headachePills);

        FoodElement importedChocolates = new FoodElement("box of imported chocolates", BigDecimal.valueOf(11.25), 1, true);
        billCalculator.printSingleBillElement(importedChocolates);

        genericGoodList.add(importedbottleOfPerfume);
        genericGoodList.add(bottleOfPerfume);
        genericGoodList.add(headachePills);
        genericGoodList.add(importedChocolates);
        billCalculator.printSalesTax(genericGoodList);
        billCalculator.printTotalAmount(genericGoodList);
    }

}
