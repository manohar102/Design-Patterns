package visitorpattern;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public double visit(Book book) {
        double cost = book.getPrice();
        // Apply $5 discount if book price is greater than $50
        if (book.getPrice() > 50) {
            cost = book.getPrice() - 5;
            System.out.println("Book [ISBN: " + book.getIsbnNumber() + "] original price: $" + book.getPrice() + ", discounted price: $" + cost);
        } else {
            System.out.println("Book [ISBN: " + book.getIsbnNumber() + "] price: $" + cost);
        }
        return cost;
    }

    @Override
    public double visit(Fruit fruit) {
        double cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " (Weight: " + fruit.getWeight() + " kg @ $" + fruit.getPricePerKg() + "/kg) cost: $" + String.format("%.2f", cost));
        return cost;
    }
}
