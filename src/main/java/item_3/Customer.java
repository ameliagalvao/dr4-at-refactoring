package item_3;

public class Customer {
    private final CustomerType type;

    public Customer(CustomerType type) {
        this.type = type;
    }

    public CustomerType getType() {
        return type;
    }
}
