class Mobile {
    String brand;
    int price;
    static String model;

    public void show() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }
}

public class staticVariale {

    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        Mobile.model = "Galaxy S21";
        obj1.price = 799;

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        Mobile.model = "iPhone 13";
        obj2.price = 999;

        Mobile.model = "Galaxy S21 Ultra"; // Static variable shared by all instances
        obj1.show();
        obj2.show();
    }
}
