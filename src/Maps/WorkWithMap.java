package Maps;

import java.util.HashMap;
import java.util.Map;

public class WorkWithMap {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>(); // Change the key type to Integer
        map.put(1, new Person("Sally", 65));
        map.put(2, new Person("John", 45));
        map.put(3, new Person("Mike", 25));
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(4));
        System.out.println(map.keySet());

    }

    record Person(String name, int age) {
    }
}
