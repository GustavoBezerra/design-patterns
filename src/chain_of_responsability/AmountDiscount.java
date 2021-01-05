package chain_of_responsability;

import java.math.BigDecimal;

public class AmountDiscount extends Discount{

    public AmountDiscount(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Order order){
        if(order.getAmount().compareTo(new BigDecimal("500")) > 0){
            return order.getAmount().multiply(new BigDecimal("0.05"));
        }

        return next.calculate(order);
    }
}
