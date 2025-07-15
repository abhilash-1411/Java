import java.io.BufferedInputStream;
import java.io.InputStreamReader;

public class userInput {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        // InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        // scanner = new java.util.Scanner(inputStreamReader); 

        // BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);
        // scanner = new java.util.Scanner(bufferedInputStream);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.println("Hello " + name + ", you are " + age + " years old.");
        
        scanner.close();
    }
}
