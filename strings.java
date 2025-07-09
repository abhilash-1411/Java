public class strings {
    public static void main(String[] args) {
        // Declare and initialize a string
        String str = "Hello, World!";
        
        // Access and print characters in the string
        System.out.println("First character: " + str.charAt(0));
        System.out.println("Last character: " + str.charAt(str.length() - 1));
        
        // Find the length of the string
        System.out.println("Length of the string: " + str.length());
        
        // Convert to uppercase and lowercase
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        
        // Concatenate another string
        String anotherStr = " How are you?";
        String concatenatedStr = str.concat(anotherStr);
        System.out.println("Concatenated string: " + concatenatedStr);
        
        // Check if the string contains a substring
        System.out.println("Contains 'World': " + str.contains("World"));
        
        // Split the string into an array of substrings
        String[] words = str.split(", ");
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
