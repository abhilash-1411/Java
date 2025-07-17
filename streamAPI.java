import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;
import java.util.stream.Stream;

public class streamAPI {
    public static void main(String args[]){
        System.out.println("Hello Stram API");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> s1=nums.stream();

        // nums.forEach((x->System.out.println(x)));
        // Consumer<Integer> con=(n)->System.out.println(n);  
        nums.forEach((n)->System.out.println(n));   

    }
}
