package visitorpattern;

public class Fruit implements ItemElement {
    private double pricePerKg;
    private double weight;
    private String name;

    public Fruit(double price, double wt, String nm) {
        this.pricePerKg = price;
        this.weight = wt;
        this.name = nm;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
