class Calculator {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }
}



public class classAndobjects {
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();   
        int sum = calculator.add(5, 3); // Example usage of the add method
        int difference = calculator.subtract(10, 4); // Example usage of the subtract method

        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
