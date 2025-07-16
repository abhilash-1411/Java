import java.util.ArrayList;
import java.util.List;


public class collectionAPI {
    public static void main(String[] args) {
        // Example of using a collection API in Java
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");

        // Iterating through the list
        for (String item : list) {
            System.out.println(item);
        }

        // Using a stream to filter and print items
        list.stream()
            .filter(s -> s.startsWith("H"))
            .forEach(System.out::println);
    }
}
