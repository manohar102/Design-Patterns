package visitorpattern;

public class Book implements ItemElement {
    private double price;
    private String isbnNumber;

    public Book(double price, String isbn) {
        this.price = price;
        this.isbnNumber = isbn;
    }

    public double getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
