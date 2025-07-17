import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;
import java.util.stream.Stream;

public class streamAPI {
    public static void main(String args[]){
        System.out.println("Hello Stram API");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5,6);
        // Stream<Integer> s1=nums.stream();
        // Stream<Integer> s2=s1.filter(n->n%2==0);
        // Stream<Integer> s3= s2.map(x->x*2);

        // int result=s3.reduce(0,(c,e)->c+e);

        int result=nums.stream()
                            .filter(n->n%2==0)
                            .map(n->(n*2))
                            .reduce(0,(c,e)->c+e);
              

        // nums.forEach((x->System.out.println(x)));
        // Consumer<Integer> con=(n)->System.out.println(n);  
        // nums.forEach((n)->System.out.println(n));   

        // s1.forEach((x->System.out.println(x)));
        // s2.forEach((x->System.out.println(x)));
        // s3.forEach((x->System.out.println(x)));
          System.out.println(result);

    }
}
