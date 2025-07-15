class Car {
    
    public void drive() {
        System.out.println("Car is starting");
    }
}
class WagonR extends Car {
    @Override
    public void drive() {
        System.out.println("WagonR is driving");
    }
}


public class annotations {
    public static void main(String[] args) {
        System.out.println("Annotations in Java");
        WagonR obj = new WagonR();
        obj.drive();
    }
}
