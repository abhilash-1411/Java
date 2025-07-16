
import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        // Create a set using HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Cherry");

        // Display the elements in the HashSet
        System.out.println("HashSet: " + hashSet);

        // Create a set using TreeSet
        java.util.Set<String> treeSet = new java.util.TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Cherry");

        // Display the elements in the TreeSet
        System.out.println("TreeSet: " + treeSet);
    }
}
