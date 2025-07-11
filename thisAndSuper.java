
class A{
    A() {
        System.out.println("Constructor of class A, Object created");
    }
    A(int x) {
        System.out.println("Constructor of class A with parameter, Object created");
    }
}


class B extends A{
    B() {
        // super(); // This is optional, as the compiler adds it implicitly
        super(); // Calling the default constructor of class A
        System.out.println("Constructor of class B, Object created");
    } 
    B(int x) {
        // super(); // This is optional, as the compiler adds it implicitly
        // super();
        this();
        System.out.println("Constructor of class B with parameter, Object created");
    }
    
}
public class thisAndSuper {
    public static void main(String[] args) {
        B objB = new B(5); // Creating an object of class B, which calls the constructor of A first
    }
}
