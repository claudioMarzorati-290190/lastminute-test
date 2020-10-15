package main;

import abs.GenericGood;
import impl.BillCalculator;
import model.BookProduct;
import model.FoodProduct;
import model.GeneralProduct;
import model.MedicalProduct;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BillMainGenerator {

    protected static final String OUTPUT_FILE_NAME = "output.txt";

    public static void main(String[] args) throws IOException {
        File fout = new File(OUTPUT_FILE_NAME);
        FileOutputStream fos = new FileOutputStream(fout);

        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos))) {

            BillCalculator billCalculator = new BillCalculator();

            List<GenericGood> genericGoodList = new ArrayList<>();
            BookProduct bookProduct = new BookProduct(BigDecimal.valueOf(12.49), 1, false);
            bw.write(billCalculator.printSingleBillElement(bookProduct));
            bw.newLine();
            GeneralProduct musicCd = new GeneralProduct("music CD", BigDecimal.valueOf(14.99), 1, false);
            bw.write(billCalculator.printSingleBillElement(musicCd));
            bw.newLine();
            FoodProduct chocolateBar = new FoodProduct("chocolate bar", BigDecimal.valueOf(0.85), 1, false);
            bw.write(billCalculator.printSingleBillElement(chocolateBar));
            bw.newLine();

            genericGoodList.add(bookProduct);
            genericGoodList.add(musicCd);
            genericGoodList.add(chocolateBar);
            bw.write(billCalculator.printSalesTax(genericGoodList));
            bw.newLine();
            bw.write(billCalculator.printTotalAmount(genericGoodList));
            bw.write("\n\n");

            genericGoodList = new ArrayList<>();
            FoodProduct importedChocolates = new FoodProduct("imported box of chocolates", BigDecimal.TEN, 1, true);
            bw.write(billCalculator.printSingleBillElement(importedChocolates));
            bw.newLine();
            GeneralProduct perfume = new GeneralProduct("imported bottle of perfume", BigDecimal.valueOf(47.5), 1, true);
            bw.write(billCalculator.printSingleBillElement(perfume));
            bw.newLine();

            genericGoodList.add(importedChocolates);
            genericGoodList.add(perfume);
            bw.write(billCalculator.printSalesTax(genericGoodList));
            bw.newLine();
            bw.write(billCalculator.printTotalAmount(genericGoodList));
            bw.write("\n\n");

            genericGoodList = new ArrayList<>();

            GeneralProduct importedbottleOfPerfume = new GeneralProduct("imported bottle of perfume", BigDecimal.valueOf(27.99), 1, true);
            bw.write(billCalculator.printSingleBillElement(importedbottleOfPerfume));
            bw.newLine();

            GeneralProduct bottleOfPerfume = new GeneralProduct("bottle of perfume", BigDecimal.valueOf(18.99), 1, false);
            bw.write(billCalculator.printSingleBillElement(bottleOfPerfume));
            bw.newLine();

            MedicalProduct headachePills = new MedicalProduct("packet of headache pills", BigDecimal.valueOf(9.75), 1, false);
            bw.write(billCalculator.printSingleBillElement(headachePills));
            bw.newLine();

            importedChocolates = new FoodProduct("box of imported chocolates", BigDecimal.valueOf(11.25), 1, true);
            bw.write(billCalculator.printSingleBillElement(importedChocolates));
            bw.newLine();

            genericGoodList.add(importedbottleOfPerfume);
            genericGoodList.add(bottleOfPerfume);
            genericGoodList.add(headachePills);
            genericGoodList.add(importedChocolates);
            bw.write(billCalculator.printSalesTax(genericGoodList));
            bw.newLine();
            bw.write(billCalculator.printTotalAmount(genericGoodList));
        }
    }
}
