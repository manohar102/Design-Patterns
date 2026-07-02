package visitorpattern;

public class VisitorPattern {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{
            new Book(20, "1234"),
            new Book(100, "5678"),
            new Fruit(2, 2, "Banana"),
            new Fruit(5, 5, "Apple")
        };

        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        
        System.out.println("--- Calculating Shopping Cart Cost ---");
        double total = 0;
        for (ItemElement item : items) {
            total += item.accept(visitor);
        }
        System.out.println("\nTotal Cost = $" + String.format("%.2f", total));
    }
}
