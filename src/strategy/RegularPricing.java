package strategy;

public class RegularPricing implements PricingStrategy {

    @Override
    public double calculateTotal(double subtotal) {
        return subtotal;
    }
}

