abstract class Car{

    public  abstract void drive() ;

    public void playMusic() {
        System.out.println("Car is starting");
    }
}
class WagonR extends Car {

    public void drive() {
        System.out.println("WagonR is driving");
    }
}
public class abstractClass {
    public static void main(String[] args) {

        Car obj=new WagonR() ;
        obj.drive();

           
       
    
}
}
