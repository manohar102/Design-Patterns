package visitorpattern;

public interface ItemElement {
    double accept(ShoppingCartVisitor visitor);
}
