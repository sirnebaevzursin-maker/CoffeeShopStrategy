package client;
import context.Order;
import strategy.HappyHourPricing;
import strategy.RegularPricing;
import strategy.StudentPricing;
import strategy.WeekendPricing;

public class Client {
    public static void main(String[] args) {
        Order order = new Order(new RegularPricing());
        order.addItem(1200);
        order.addItem(900);
        order.addItem(700);
        System.out.println("Regular:    " + order.calculateTotal());

        order.setPricingStrategy(new StudentPricing());
        System.out.println("Student:    " + order.calculateTotal());

        order.setPricingStrategy(new HappyHourPricing());
        System.out.println("Happy hour: " + order.calculateTotal());

        order.setPricingStrategy(new WeekendPricing());
        System.out.println("Weekend:    " + order.calculateTotal());
    }
}