public class literals {
    public static void main(String[] args) {
        // Integer literals
        int decimal = 100; // Decimal
        int octal = 0144; // Octal (starts with 0)
        int hexadecimal = 0x64; // Hexadecimal (starts with 0x)
        int binary = 0b1100100; // Binary (starts with 0b)

        // Floating-point literals
        float floatLiteral = 10.5f; // Float (ends with 'f')
        double doubleLiteral = 20.5; // Double (default)

        // Character literal
        char charLiteral = 'A'; // Single character

        // String literal
        String stringLiteral = "Hello, World!"; // String

        // Boolean literals
        boolean trueLiteral = true;
        boolean falseLiteral = false;

        // Print all literals
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
        System.out.println("Binary: " + binary);
        System.out.println("Float: " + floatLiteral);
        System.out.println("Double: " + doubleLiteral);
        System.out.println("Character: " + charLiteral);
        System.out.println("String: " + stringLiteral);
        System.out.println("Boolean True: " + trueLiteral);
        System.out.println("Boolean False: " + falseLiteral);
    }
}
