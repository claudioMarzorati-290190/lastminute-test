package testresult;

import abs.GenericGood;
import impl.BillCalculator;
import model.BookProduct;
import model.FoodProduct;
import model.GeneralProduct;
import model.MedicalProduct;
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
        BookProduct bookProduct = new BookProduct(BigDecimal.valueOf(12.49), 1, false);
        billCalculator.printSingleBillElement(bookProduct);
        GeneralProduct musicCd = new GeneralProduct("music CD", BigDecimal.valueOf(14.99), 1, false);
        billCalculator.printSingleBillElement(musicCd);
        FoodProduct chocolateBar = new FoodProduct("chocolate bar", BigDecimal.valueOf(0.85), 1, false);
        billCalculator.printSingleBillElement(chocolateBar);

        genericGoodList.add(bookProduct);
        genericGoodList.add(musicCd);
        genericGoodList.add(chocolateBar);
        billCalculator.printSalesTax(genericGoodList);
        billCalculator.printTotalAmount(genericGoodList);
    }

    @Test
    public void showResult2() {
        List<GenericGood> genericGoodList = new ArrayList<>();
        FoodProduct importedChocolates = new FoodProduct("imported box of chocolates", BigDecimal.TEN, 1, true);
        billCalculator.printSingleBillElement(importedChocolates);
        GeneralProduct perfume = new GeneralProduct("imported bottle of perfume", BigDecimal.valueOf(47.5), 1, true);
        billCalculator.printSingleBillElement(perfume);

        genericGoodList.add(importedChocolates);
        genericGoodList.add(perfume);
        billCalculator.printSalesTax(genericGoodList);
        billCalculator.printTotalAmount(genericGoodList);
    }

    @Test
    public void showResult3() {
        List<GenericGood> genericGoodList = new ArrayList<>();

        GeneralProduct importedbottleOfPerfume = new GeneralProduct("imported bottle of perfume", BigDecimal.valueOf(27.99), 1, true);
        billCalculator.printSingleBillElement(importedbottleOfPerfume);

        GeneralProduct bottleOfPerfume = new GeneralProduct("bottle of perfume", BigDecimal.valueOf(18.99), 1, false);
        billCalculator.printSingleBillElement(bottleOfPerfume);

        MedicalProduct headachePills = new MedicalProduct("packet of headache pills", BigDecimal.valueOf(9.75), 1, false);
        billCalculator.printSingleBillElement(headachePills);

        FoodProduct importedChocolates = new FoodProduct("box of imported chocolates", BigDecimal.valueOf(11.25), 1, true);
        billCalculator.printSingleBillElement(importedChocolates);

        genericGoodList.add(importedbottleOfPerfume);
        genericGoodList.add(bottleOfPerfume);
        genericGoodList.add(headachePills);
        genericGoodList.add(importedChocolates);
        billCalculator.printSalesTax(genericGoodList);
        billCalculator.printTotalAmount(genericGoodList);
    }

}
