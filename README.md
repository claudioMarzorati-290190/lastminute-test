# Lastminute.com Test by Marzorati Claudio Augusto

To clone this repository use:<br>
<i>git clone https://github.com/claudioMarzorati-290190/lastminute-test.git </i>
<p>
This project is related to this Travis CI
<br>
https://travis-ci.com/github/claudioMarzorati-290190/lastminute-test/
</p>

For any further questions please refer to:<br>
* claudio.marzorati90@gmail.com

<hr/>
<h3>Problem</h3>
Basic sales tax is applicable at a rate of 10% on all goods, except books, food, and medical
products that are exempt. Import duty is an additional sales tax applicable on all imported goods
at a rate of 5%, with no exemptions.<br>
When I purchase items I receive a receipt which lists the name of all the items and their price
(including tax), finishing with the total cost of the items, and the total amounts of sales taxes
paid. The rounding rules for sales tax are that for a tax rate of n%, a shelf price of p contains
(np/100 rounded up to the nearest 0.05) amount of sales tax.<p>
Write an application that prints out the receipt details for these shopping baskets...</p><p>
INPUT:<br>
Input 1:<br>
1 book at 12.49<br>
1 music CD at 14.99<br>
1 chocolate bar at 0.85<br>
</p>
<p>
Input 2:<br>
1 imported box of chocolates at 10.00<br>
1 imported bottle of perfume at 47.50<br>
</p>
<p>
Input 3:<br>
1 imported bottle of perfume at 27.99<br>
1 bottle of perfume at 18.99<br>
1 packet of headache pills at 9.75<br>
1 box of imported chocolates at 11.25
</p>
<p>
OUTPUT<br>
Output 1:<br>
1 book : 12.49<br>
1 music CD: 16.49<br>
1 chocolate bar: 0.85<br>
Sales Taxes: 1.50<br>
Total: 29.83
</p>
<p>
Output 2:<br>
1 imported box of chocolates: 10.50<br>
1 imported bottle of perfume: 54.65<br>
Sales Taxes: 7.65<br>
Total: 65.15
</p>
<p>
Output 3:<br>
1 imported bottle of perfume: 32.19<br>
1 bottle of perfume: 20.89<br>
1 packet of headache pills: 9.75<br>
1 imported box of chocolates: 11.85<br>
Sales Taxes: 6.70<br>
Total: 74.68

<hr/>
<h3>Technical Overview</h3>

##### Tests Result is generated both in: 
* Junit Tests -> [TestResult.java](https://github.com/claudioMarzorati-290190/lastminute-test/blob/main/src/test/java/testresult/TestResult.java)
* Java Main Class that writes into a file -> [BillMainGenerator.java](https://github.com/claudioMarzorati-290190/lastminute-test/blob/main/src/main/java/main/BillMainGenerator.java)

#####  Abstract class is:
* [GenericGood.java](https://github.com/claudioMarzorati-290190/lastminute-test/blob/main/src/main/java/abs/GenericGood.java) -> Represent a generic Product that cannot be instantiated. We use this Class to not repeat every method in
Product concrete classes;

#####  Product concrete classes are:
1. [FoodProduct.java](https://github.com/claudioMarzorati-290190/lastminute-test/blob/main/src/main/java/model/FoodProduct.java) -> Represents Food product
2. [BookProduct.java](https://github.com/claudioMarzorati-290190/lastminute-test/blob/main/src/main/java/model/BookProduct.java) -> Represents a Book Product
3. [MedicalProduct.java](https://github.com/claudioMarzorati-290190/lastminute-test/blob/main/src/main/java/model/MedicalProduct.java) -> Represents a Medical Product
4. [GeneralProduct.java](https://github.com/claudioMarzorati-290190/lastminute-test/blob/main/src/main/java/model/GeneralProduct.java) -> Represents a Product that is not a Food, or book, or Medical (e.g. "bottle of perfume")

#### Business logic classes are:
* [BillCalculator.java](https://github.com/claudioMarzorati-290190/lastminute-test/blob/main/src/main/java/impl/BillCalculator.java) -> This class contains all method that let application calculate all taxes and prices
* [CalculatorUtils.java](https://github.com/claudioMarzorati-290190/lastminute-test/blob/main/src/main/java/utils/CalculatorUtils.java) -> Utility Class which calculate the tax percentage from base price value

#### Other Junit tests
Other Junit tests written in [/src/test/java](https://github.com/claudioMarzorati-290190/lastminute-test/blob/main/src/test/java) folder to test all functionalities works as expected
