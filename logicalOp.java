public class logicalOp {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND
        boolean andResult = a && b;
        System.out.println("a AND b: " + andResult);

        // Logical OR
        boolean orResult = a || b;
        System.out.println("a OR b: " + orResult);

        // Logical NOT
        boolean notA = !a;
        System.out.println("NOT a: " + notA);
        
        // Combining logical operators
        boolean combinedResult = (a && !b) || (b && a);
        System.out.println("Combined result: " + combinedResult);
    }
}
