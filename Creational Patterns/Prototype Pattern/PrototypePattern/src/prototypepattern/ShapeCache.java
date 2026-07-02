package prototypepattern;

import java.util.Hashtable;

public class ShapeCache {
    // Cache of shape prototypes keyed by ID
    private static Hashtable<Integer, Shape> shapeMap = new Hashtable<>();

    /**
     * Retrieves a cloned shape from the cache.
     * 
     * @param shapeId the identifier of the shape to retrieve
     * @return a cloned Shape instance
     * @throws CloneNotSupportedException
     */
    public static Shape getShape(int shapeId) throws CloneNotSupportedException {
        Shape cachedShape = shapeMap.get(shapeId);
        // Defensive copy via clone to avoid mutating the cached prototype
        return (Shape) cachedShape.clone();
    }

    /**
     * Loads initial shape prototypes into the cache.
     */
    public static void loadCache() {
        Shape circle = new Circle();
        circle.setId(1);
        circle.setColor("Red");
        shapeMap.put(circle.getId(), circle);

        Shape rectangle = new Rectangle();
        rectangle.setId(2);
        rectangle.setColor("Blue");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
