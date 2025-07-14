class A {
    public void show() {
        System.out.println("This is class A");
    }

}

class B extends A {

    public void show() {
        System.out.println("This is class B");
    }
}

class C extends A {
    public void show() {
        System.out.println("This is class C");
    }

}

public class polymorphism {
    public static void main(String[] args) {
        // B objB = new B();
        // objB.show();

        // A obj= new B();
        // obj.show(); // This will call the show method of class A, demonstrating polymorphism

        A obj=new A();
        obj.show(); // This will call the show method of class A

        obj = new B();
        obj.show(); // This will call the show method of class B, demonstrating polymorphism

        obj = new C();
        obj.show(); // This will call the show method of class C, demonstrating polymorphism

    }
}
