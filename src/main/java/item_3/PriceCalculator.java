package item_3;

import java.util.List;

public class PriceCalculator {
    private final List<DiscountStrategy> rules;

    public PriceCalculator(List<DiscountStrategy> rules) {
        this.rules = rules;
    }

    public double calculateFinalPrice(double basePrice, Customer customer, boolean isHoliday) {
        double totalDiscount = rules.stream()
                .mapToDouble(rule -> rule.getDiscountRate(customer, isHoliday))
                .sum();

        return basePrice * (1 - totalDiscount);
    }
}