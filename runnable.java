
public class runnable {
    public static void main(String[] args) {
      
        Runnable obj1 = () ->{
               for (int i = 0; i < 5; i++) {
                   System.out.println("Hello from A " + i);
                   try {
                       Thread.sleep(10);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           };

        Runnable obj2 = ()-> {
               for (int i = 0; i < 5; i++) {
                   System.out.println("Hii from B " + i);
                   try {
                       Thread.sleep(10);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   } 
               }
           };

        Thread thread1 = new Thread(obj1); // Create a thread for A
        Thread thread2 = new Thread(obj2); // Create a thread for B

        thread1.start(); // Start thread A
        thread2.start(); // Start thread B
    }
}


      
