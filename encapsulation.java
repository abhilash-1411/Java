class Human{
   private int age;
   private String name;


   public Human() {
       // Default constructor
         // Initializes the object with default values
         // This constructor is called every time when an object of this class is created
       name = "Johny";
       age = 12;
   }
    // Parameterized constructor
    public Human(int age, String name) {
         this.age = age;
         this.name = name;  
            // this keyword is used to refer to the current object
    }
   // Getter for Age
   public int getAge() {
       return age;
   }
   public void setAge(int age) {
       this.age = age;
   }

   // Getter for Name
   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
       // this represents the object of the current class
   }
}


public class encapsulation {
    public static void main(String[] args) {
        
        Human obj = new Human();
        Human obj1 = new Human(25, "Abhilash");
        // Using the parameterized constructor
        // Using the default constructor

        // obj.setAge(25);
        // obj.setName("Abhilash");
        System.out.println("Age: " + obj.getAge());
        System.out.println("Name: " + obj.getName());

        System.out.println("Age: " + obj1.getAge());
        System.out.println("Name: " + obj1.getName());
    }
}
