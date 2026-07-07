package flyweightpattern;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String otherTreeData) {
        String key = name + "_" + color + "_" + otherTreeData;
        TreeType result = treeTypes.get(key);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(key, result);
            System.out.println("Creating new TreeType: " + name + " (Color: " + color + ")");
        }
        return result;
    }

    public static int getTreeTypesCount() {
        return treeTypes.size();
    }
}
