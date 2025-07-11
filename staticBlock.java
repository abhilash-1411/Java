class Mobile{
    String brand;
    int price;
    static String model;


    static {
        // Static block to initialize static variable
        model = "Default Model"; // Default value for static variable
        System.out.println("Static block executed. Model initialized to: " + model);
        // It is executed only once when the class is loaded.");
    }
    public Mobile() {
        // Constructor can be used to initialize instance variables if needed
        brand = "";
        price = 200;
        System.out.println("Constructor executed. Brand and Price initialized.");
        
    }

    public void show() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }
}


public class staticBlock {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        mobile1.brand = "Apple";
        mobile1.price = 1000;
        Mobile.model = "iPhone 14";

        Mobile mobile2 = new Mobile();
        mobile2.brand = "Samsung";
        mobile2.price = 800;
        Mobile.model = "Galaxy S21";

        mobile1.show();
        mobile2.show();
    }
}
