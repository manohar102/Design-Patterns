package strategypattern;

public class StrategyPattern {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("1234", 19.99));
        cart.addItem(new Item("5678", 5.50));
        cart.addItem(new Item("9012", 120.00));

        System.out.println("--- Checkout using Credit Card ---");
        cart.pay(new CreditCardStrategy("John Doe", "1234567890123456", "999", "12/29"));

        System.out.println("\n--- Checkout using PayPal ---");
        cart.pay(new PaypalStrategy("john.doe@example.com", "mysecretpwd"));
    }
}
