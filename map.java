import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        // Create a map using HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);
        hashMap.put("Cherry", 4); // This will overwrite the previous value

        // Display the elements in the HashMap
        System.out.println("HashMap: " + hashMap);

        // Create a map using TreeMap
        java.util.Map<String, Integer> treeMap = new java.util.TreeMap<>();
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Cherry", 3);
        treeMap.put("Cherry", 4); // This will overwrite the previous value

        // Display the elements in the TreeMap
        System.out.println("TreeMap: " + treeMap);
    }
}
