package chain_of_responsability;

import java.math.BigDecimal;

public class DiscountTest {

    public static void main(String[] args) {
        Order order = new Order(new BigDecimal("100"), 1);
        DiscountCalculator discountCalculator = new DiscountCalculator();

        System.out.println(discountCalculator.calculate(order));
    }
}
