package strategy;

public class HappyHourPricing implements PricingStrategy {
    private static final double HAPPY_HOUR_DISCOUNT_RATE = 0.30;

    @Override
    public double calculateTotal(double subtotal) {
        return subtotal * (1 - HAPPY_HOUR_DISCOUNT_RATE);
    }
}

