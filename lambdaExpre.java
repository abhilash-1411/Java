interface A{
    void show(int i);
}


public class lambdaExpre {
    public static void main(String[] args) {
       A obj = ( i) -> System.out.println("This is a lambda expression in action: " + i);
       obj.show(5);
    }
}
