package flyweightpattern;

public class FlyweightPattern {
    public static void main(String[] args) {
        Forest forest = new Forest();

        System.out.println("--- Planting Forest ---");
        forest.plantTree(10, 20, "Oak", "Green", "Rough bark");
        forest.plantTree(15, 25, "Oak", "Green", "Rough bark"); // Reuses
        forest.plantTree(100, 200, "Pine", "Dark Green", "Pine cones");
        forest.plantTree(110, 210, "Pine", "Dark Green", "Pine cones"); // Reuses
        forest.plantTree(50, 80, "Cherry", "Pink", "Cherry blossoms");

        System.out.println("\n--- Drawing Forest ---");
        forest.draw();

        System.out.println("\n--- Statistics ---");
        System.out.println("Total trees planted: 5");
        System.out.println("Total unique tree types (Flyweight objects created): " + TreeFactory.getTreeTypesCount());
    }
}
