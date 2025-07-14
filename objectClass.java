class Laptop {
    String model;
    int price;
    public String toString() {
        return "Model: " + model + ", Price: " + price;
    }
    public boolean equals(Laptop that ) {
       // Compare model and price
        if (this.model.equals(that.model) && this.price == that.price) {
            return true; // Objects are considered equal
        }
        return false; // Objects are not equal
    }
}
public class objectClass {
    public static void main(String[] args) {
        // Create an object of class Laptop
        Laptop objLaptop = new Laptop();
        objLaptop.model = "Dell XPS 13";
        objLaptop.price = 1200;

        Laptop objLaptop2Laptop = new Laptop();
        objLaptop2Laptop.model = "Dell XPS 13";
        objLaptop2Laptop.price = 1200;

        // // Call the show method
        // System.out.println("Model: " + objLaptop.model);
        // System.out.println("Price: " + objLaptop.price);

    //   System.out.println(objLaptop.toString());
   boolean isEqual = objLaptop.equals(objLaptop2Laptop);
        System.out.println("Are the two Laptop objects equal? " + isEqual);
        // The equals method compares the memory addresses of the two objects
        // If they are the same, it returns true, otherwise false
        // In this case, it will return false because they are different objects
    }
}
