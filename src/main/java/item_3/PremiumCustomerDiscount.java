package item_3;

public class PremiumCustomerDiscount implements DiscountStrategy {
    public static final double PREMIUM_DISCOUNT = 0.15;

    @Override
    public double getDiscountRate(Customer customer, boolean isHoliday) {
        return customer.getType() == CustomerType.PREMIUM ? PREMIUM_DISCOUNT : 0.0;
    }
}