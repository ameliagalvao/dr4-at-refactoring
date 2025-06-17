package item_3;

public interface DiscountStrategy {
    double getDiscountRate(Customer customer, boolean isHoliday);
}
