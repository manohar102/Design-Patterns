package flyweightpattern;

public class TreeType {
    private String name;
    private String color;
    private String otherTreeData;

    public TreeType(String name, String color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing tree of type [Name: " + name + ", Color: " + color + ", Data: " + otherTreeData + "] at coordinates (" + x + ", " + y + ")");
    }
}
