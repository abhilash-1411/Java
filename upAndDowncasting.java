class A {
    public void show1() {
        System.out.println("This is class A");
    }
}

class B extends A {
    public void show2() {
        System.out.println("This is class B");
    }
}

public class upAndDowncasting {
    public static void main(String[] args) {
       double d=4.5;
    // typecast:
    //    int i=(int)d;

    //    System.out.println("Double value: " + d);
    //    System.out.println("Integer value: " + i);

        // Upcasting
        A objA = (A) new B();
        objA.show1(); // This will call the show method from class A


        B objB = (B) objA; // Downcasting
        objB.show2(); // This will call the show method from class B
        

       
    }
}
