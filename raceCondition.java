class Count {
    int count = 0;
    public synchronized void increment() {
        count++;
    }
}



public class raceCondition {
    public static void main(String[] args) throws InterruptedException {
        Count counter = new Count();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                counter.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                counter.increment();
            }
           };

        Thread thread1 = new Thread(obj1); // Create a thread for A
        Thread thread2 = new Thread(obj2); // Create a thread for B

        thread1.start(); // Start thread A
        thread2.start(); // Start thread B

        thread1.join(); // Wait for thread A to finish
        thread2.join(); // Wait for thread B to finish

        System.out.println(counter.count); // Output the final count
    }
}
