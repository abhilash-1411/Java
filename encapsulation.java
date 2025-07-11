class Human{
   private int age;
   private String name;

   // Getter for Age
   public int getAge() {
       return age;
   }
   public void setAge(int a) {
       age = a;
   }

   // Getter for Name
   public String getName() {
       return name;
   }

   public void setName(String n) {
       name = n;
   }
}


public class encapsulation {
    public static void main(String[] args) {
        
        Human obj = new Human();

        obj.setAge(25);
        obj.setName("Abhilash");
        System.out.println("Age: " + obj.getAge());
        System.out.println("Name: " + obj.getName());
    }
}
