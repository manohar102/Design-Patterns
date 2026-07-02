
package prototypepattern;

/**
 *
 * @author Manohar Krishna
 */
public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public String toString() {
        return "Circle {" + "Id : " + this.getId() + ", Color:" + this.getColor() + '}';
    }
}
