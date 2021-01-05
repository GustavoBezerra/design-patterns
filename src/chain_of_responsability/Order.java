package chain_of_responsability;

import java.math.BigDecimal;

public class Order {

    private BigDecimal amount;
    private int quantity;

    public Order(BigDecimal amount) {
        this.amount = amount;
    }

    public Order(BigDecimal amount, int quantity) {
        this.amount = amount;
        this.quantity = quantity;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getQuantity() {
        return quantity;
    }
}
