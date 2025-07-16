import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
   
    String name;
    int age;
    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student{name='" + name + "', age=" + age + '}';
    }   
}
public class comparableAndComparator {
        public static void main(String[] args) {
            // Example of Comparable
           List<String> list = new ArrayList<>();
            list.add("Banana");
            list.add("Apple");
            list.add("Cherry");
              Collections.sort(list); // Sorts using natural ordering (Comparable)
            System.out.println("Sorted List (Comparable): " + list);

            // Example of Comparator
            List<String> list2 = new ArrayList<>();
            list2.add("Banana");
            list2.add("Apple");
            list2.add("Cherry");
            Collections.sort(list2, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o2.compareTo(o1); // Sorts in reverse order
                }
            });
            System.out.println("Sorted List (Comparator): " + list2);

            Comparator<Integer> comp = new Comparator<Integer>() {
                public int compare(Integer o1, Integer o2) {
                    if(o1%10>o2%10) {
                        return 1; // Sort by last digit in ascending order
                    } else if(o1%10<o2%10) {
                        return -1; // Sort by last digit in ascending order
                    } else {
                        return 0; // Equal last digits
                    }
                }
            };

            List<Integer> numbers = new ArrayList<>();
            numbers.add(43);   
            numbers.add(31);
            numbers.add(72); 
            numbers.add(29);
            Collections.sort(numbers,comp);
            System.out.println("Sorted Numbers according to last digit (Comparator): " + numbers);

            List<Student> students = new ArrayList<>();
            students.add(new Student("Alice", 22)); 
            students.add(new Student("Bob", 20));
            students.add(new Student("Charlie", 23));
            students.add(new Student("David", 21));

            Comparator<Student> studentComparator = new Comparator<Student>() {
                public int compare(Student s1, Student s2) {
                    if(s1.age > s2.age) {
                        return 1; // s1 is older
                    } else if(s1.age < s2.age) {
                        return -1; // s2 is older
                    } else {
                        return 0; // Same age
                    }
                }
            };
            Collections.sort(students, studentComparator);
            System.out.println("Sorted Students (Comparator): " + students);
        }
    }



