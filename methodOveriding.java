class Calculator {
    // Method to be overridden
    public int add(int a, int b) {
        return a + b;
    }
}
class AdvancedCalculator extends Calculator {
    // Overriding the add method
    // @Override
    public int add(int a, int b) {
        System.out.println("Advanced addition method called");
        return a + b + 10; // Adding an extra 10 for demonstration
    }
}


public class methodOveriding {
    public static void main(String[] args) {
        AdvancedCalculator advCalc = new AdvancedCalculator();

        System.out.println("Addition using AdvancedCalculator: " + advCalc.add(5, 3));
        // This will call the overridden method in AdvancedCalculator
    }
}
