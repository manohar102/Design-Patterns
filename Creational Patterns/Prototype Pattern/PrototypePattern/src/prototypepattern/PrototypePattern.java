package prototypepattern;
public class PrototypePattern {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadShapes();
        Shape clonedShape = ShapeCache.getShape(1);
        System.out.println(clonedShape);
        
        Shape clonedShape2 = ShapeCache.getShape(2);
        System.out.println(clonedShape2);
        
        Shape clonedShape3 = ShapeCache.getShape(3);
        System.out.println(clonedShape3);
    }   
}
