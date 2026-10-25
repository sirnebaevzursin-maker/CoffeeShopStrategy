package context;
import strategy.PricingStrategy;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Double> itemPrices = new ArrayList<>();
    private PricingStrategy pricingStrategy;

    public Order(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void addItem(double price) {
        itemPrices.add(price);
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateTotal() {
        double subtotal = itemPrices.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
        double total = pricingStrategy.calculateTotal(subtotal);
        return Math.round(total * 100.0) / 100.0;
    }
}