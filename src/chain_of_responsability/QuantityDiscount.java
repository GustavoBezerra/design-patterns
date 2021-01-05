package chain_of_responsability;

import java.math.BigDecimal;

public class QuantityDiscount extends  Discount{

    public QuantityDiscount(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Order order){
        if(order.getQuantity() > 5){
            return order.getAmount().multiply(new BigDecimal("0.1"));
        }

        return next.calculate(order);
    }
}
