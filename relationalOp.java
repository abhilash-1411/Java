public class relationalOp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Equal to
        boolean isEqual = (a == b);
        System.out.println("a is equal to b: " + isEqual);

        // Not equal to
        boolean isNotEqual = (a != b);
        System.out.println("a is not equal to b: " + isNotEqual);

        // Greater than
        boolean isGreater = (a > b);
        System.out.println("a is greater than b: " + isGreater);

        // Less than
        boolean isLess = (a < b);
        System.out.println("a is less than b: " + isLess);

        // Greater than or equal to
        boolean isGreaterOrEqual = (a >= b);
        System.out.println("a is greater than or equal to b: " + isGreaterOrEqual);

        // Less than or equal to
        boolean isLessOrEqual = (a <= b);
        System.out.println("a is less than or equal to b: " + isLessOrEqual);
    }
}
