package strategy;

import java.math.BigDecimal;

public class TaxCalculator {

    public BigDecimal calculate(Order order, Tax tax){
        return tax.calculate(order);
    }
}
