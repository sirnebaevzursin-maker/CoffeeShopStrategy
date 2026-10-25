package strategy;

public class WeekendPricing implements PricingStrategy {
    private static final double WEEKEND_FLAT_DISCOUNT = 300;

    @Override
    public double calculateTotal(double subtotal) {
        return Math.max(0, subtotal - WEEKEND_FLAT_DISCOUNT);
    }
}


