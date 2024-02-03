package Sets;

import java.util.Hashtable;
import java.util.HashSet;
import java.util.Set;

public class WorkWithSets {
    public static void main(String[] args) {
        Set<Ball> balls= new HashSet<>();
        balls.add(new Ball("red"));
        balls.add(new Ball("red"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("green"));
        System.out.println(balls);
        balls.forEach(System.out::println);
    }
    record Ball(String color) {
    }//These components are automatically declared as private final
    // fields and are accessible through automatically generated accessor methods.
}
