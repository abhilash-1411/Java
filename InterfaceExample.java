interface A{
    int age = 25;  //by default, all variables in an interface are public, static, and final
    String name = "Interface Example"; // This is a constant, cannot be changed
    int area = 100;
    void show();
    void config();
}

class B implements A{
    public void show() {
        System.out.println("This is class B");
    }
    
    public void config() {
        System.out.println("Configuring class B");
    }
}



public class InterfaceExample {
    public static void main(String[] args) {
        
        A obj;
        obj = new B(); // Creating an object of class B using interface A
        obj.show(); // Calling the show method from class B
        obj.config(); // Calling the config method from class B

        System.out.println("Age: " + A.age); // Accessing the constant from interface A
        System.out.println("Name: " + A.name); // Accessing the constant from interface A
        System.out.println("Area: " + A.area); // Accessing the constant from interface
    }

}
