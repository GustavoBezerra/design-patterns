package strategy;

import java.math.BigDecimal;

public interface Tax {

    public BigDecimal calculate(Order order);
}
