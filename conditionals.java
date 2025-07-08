public class conditionals {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // If statement
        if (a < b) {
            System.out.println("a is less than b");
        }

        // If-else statement
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is not greater than b");
        }

        // Else-if ladder
        if (a < b) {
            System.out.println("a is less than b");
        } else if (a == b) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("a is greater than b");
        }

        // Switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
                break;
        }
    }
}
