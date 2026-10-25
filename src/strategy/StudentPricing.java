package strategy;

public class StudentPricing implements PricingStrategy {
    private static final double STUDENT_DISCOUNT_RATE = 0.15;

    @Override
    public double calculateTotal(double subtotal) {
        return subtotal * (1 - STUDENT_DISCOUNT_RATE);
    }
}






