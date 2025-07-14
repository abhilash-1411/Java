 class Calc{
   final public void show() {
        System.out.println("This is class Calc");
    }

    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}

// class AdvancedCalc extends Calc {
//     // Cannot override methods from a final class
// }

class AdvancedCalc extends Calc {
    // This class cannot override methods from Calc because Calc is not declared as final
    // However, it can still inherit from Calc and use its methods

    public void show() {
   
        System.out.println("This is class AdvancedCalc");
    }

}

public class finalKeyword {
    public static void main(String[] args) {
    //    Calc obj=new Calc();
    //    obj.show();
    //    obj.add(5, 10);
       AdvancedCalc advObj = new AdvancedCalc();
       advObj.show();
       
    }
}
