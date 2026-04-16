import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        // java.util.Map<String, String> maps = new TreeMap<>();
        java.util.Map<String, String> maps = new TreeMap<>();
        maps.put("one", "Value1");
        maps.put("two", "Value2");
        maps.put("three", "Value3");

        for (String keyMap : maps.keySet()) {
            System.out.println(keyMap + ": " + maps.get(keyMap));
        }
    }
}
