class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting (widening)
        int num = 100;
        long longNum = num; // int to long
        float floatNum = longNum; // long to float
        double doubleNum = floatNum; // float to double

        // Explicit casting (narrowing)
        double d = 9.78;
        int i = (int) d; // double to int
        System.out.println("Original double: " + d);
        System.out.println("After explicit casting to int: " + i);
    }
}
