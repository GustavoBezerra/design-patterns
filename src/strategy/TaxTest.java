package strategy;

import java.math.BigDecimal;

public class TaxTest {

    public static void main(String[] args) {
        Order order = new Order(new BigDecimal("100"));
        TaxCalculator taxCalculator = new TaxCalculator();

        System.out.println(taxCalculator.calculate(order, new ISS()));
    }
}
