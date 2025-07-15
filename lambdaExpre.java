interface A{
    // void show(int i);
    int add(int a, int b);
}


public class lambdaExpre {
    public static void main(String[] args) {
    //    A obj = ( i) -> System.out.println("This is a lambda expression in action: " + i);
    //    obj.show(5);
        A obj = (a, b) -> a + b; // Lambda expression for the add method
        int result = obj.add(5, 10); // Calling the add method
        System.out.println("Result of addition: " + result); // Output the result
    }
}
