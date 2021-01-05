package chain_of_responsability;

import java.math.BigDecimal;

public class NoDiscount extends Discount{

    public NoDiscount() {
        super(null);
    }

    @Override
    public BigDecimal calculate(Order order) {
        return BigDecimal.ZERO;
    }
}
