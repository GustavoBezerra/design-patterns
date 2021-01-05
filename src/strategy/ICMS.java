package strategy;

import java.math.BigDecimal;

public class ICMS implements Tax{

    public BigDecimal calculate(Order order){
        return order.getAmount().multiply(new BigDecimal("0.1"));
    }
}
