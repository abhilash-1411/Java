@FunctionalInterface
interface A {
    void show();
}
// class B implements A {
// public void show() {
// System.out.println("This is class B");
// }
// }

public class functionalInterface {
    public static void main(String[] args) {
        // System.out.println("Functional Interfaces in Java");
        A obj = new A() {
            public void show() {
                System.out.println("This is class B");
            }
        };
        obj.show();
    }
}
