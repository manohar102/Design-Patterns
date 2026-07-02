package prototypepattern;

/**
 *
 * @author Manohar Krish na
 */
public class Rectangle extends Shape {
    Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public String toString() {
        return "Rectangle {" + "Id : " + this.getId() + ", Color:" + this.getColor() + '}';
    }
}
