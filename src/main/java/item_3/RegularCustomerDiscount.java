package item_3;

public class RegularCustomerDiscount implements DiscountStrategy {
    private static final double REGULAR_DISCOUNT = 0.10;

    @Override
    public double getDiscountRate(Customer customer, boolean isHoliday) {
        return customer.getType() == CustomerType.REGULAR ? REGULAR_DISCOUNT : 0.0;
    }
}