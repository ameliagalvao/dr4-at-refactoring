package item_3;

public class HolidayDiscount implements DiscountStrategy {
    private static final double HOLIDAY_DISCOUNT = 0.05;

    @Override
    public double getDiscountRate(Customer customer, boolean isHoliday) {
        return isHoliday ? HOLIDAY_DISCOUNT : 0.0;
    }
}