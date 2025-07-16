class A extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from A " + i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hii from B " + i);
        }
    }
}

public class threads {
    public static void main(String[] args) {
        System.out.println("Threads in Java");
        
        A obj1 = new A();
        B obj2 = new B();
        
        obj1.start(); // Start thread A
        obj2.start(); // Start thread B
        
        

    }
}
