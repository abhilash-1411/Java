public class arithematicOp {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient);

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);

        // Increment
        a++;        
        System.out.println("Incremented a: " + a); 
        ++a; // Pre-increment
        System.out.println("Pre-incremented a: " + a);

        // Decrement
        b--;
        System.out.println("Decremented b: " + b);  
    }
}
