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
        // Create an instance of the Dog class
        Calculator calculator = new Calculator();   
        calculator.add(5, 3); // Example usage of the add method
        calculator.subtract(10, 4); // Example usage of the subtract method
    }
}
