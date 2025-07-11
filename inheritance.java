

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}   
class AdvancedCalculator extends Calculator {
    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}    

public class inheritance {
    public static void main(String[] args) {
        // Calculator calc = new Calculator();
        // System.out.println("Addition: " + calc.add(5, 3));
        // System.out.println("Subtraction: " + calc.subtract(5, 3));
        AdvancedCalculator advCalc = new AdvancedCalculator();
        System.out.println("Addition: " + advCalc.add(5, 3));
        System.out.println("Subtraction: " + advCalc.subtract(5, 3));
        System.out.println("Multiplication: " + advCalc.multiply(5, 3));
        System.out.println("Division: " + advCalc.divide(5, 0));
    }
}
