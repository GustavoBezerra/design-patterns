package chain_of_responsability;

import java.math.BigDecimal;

public class DiscountCalculator {

    public BigDecimal calculate(Order order){

        Discount discount = new QuantityDiscount(new AmountDiscount(new NoDiscount()));

        return discount.calculate(order);
    }
}
