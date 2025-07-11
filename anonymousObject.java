class A{

    A() {
        System.out.println("Constructor of class A,Object created");
    }
    public void show() {
        System.out.println("This is class A");
    }
}


public class anonymousObject {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();

        // Anonymous object
        // new A();
        new A().show();
        // The object is created and the show method is called immediately
}
}

