

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
class veryAdvancedCalculator extends AdvancedCalculator {
    // This class can have additional methods or override existing ones
    public double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}

public class inheritance {
    public static void main(String[] args) {
        // Calculator calc = new Calculator();
        // System.out.println("Addition: " + calc.add(5, 3));
        // System.out.println("Subtraction: " + calc.subtract(5, 3));
        // AdvancedCalculator advCalc = new AdvancedCalculator();
        veryAdvancedCalculator veryAdvCalc = new veryAdvancedCalculator();
        System.out.println("Addition: " + veryAdvCalc.add(5, 3));
        System.out.println("Subtraction: " + veryAdvCalc.subtract(5, 3));
        System.out.println("Multiplication: " + veryAdvCalc.multiply(5, 3));
        System.out.println("Division: " + veryAdvCalc.divide(5, 1));
        System.out.println("Power: " + veryAdvCalc.power(2, 3));
    }
}
