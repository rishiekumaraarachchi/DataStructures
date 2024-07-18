package Array;


import java.util.ArrayList;
import java.util.List;


public class WorkWithList {
    public static void main(String[] args) {
        List<String> colorUnmodified = List.of("red", "green", "blue");
        System.out.println(colorUnmodified);
        List<Integer> list  = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
    }
}
