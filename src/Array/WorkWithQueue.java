package Array;

import java.util.LinkedList;
import java.util.Queue;

public class WorkWithQueue {
    public static void main(String[] args) {
        Queue <Person> supermarkrt = new LinkedList<>();
        supermarkrt.add(new Person("Sally", 65));
        supermarkrt.add(new Person("John", 45));
        supermarkrt.add(new Person("Mike", 25));

        System.out.println(supermarkrt);
        System.out.println(supermarkrt.peek());
        //Peek returns the head of the queue, or null if the queue is empty.
        System.out.println(supermarkrt.poll());
        //It retrieves and removes the head (first element) of the queue. If the queue is empty, it returns null.
        System.out.println(supermarkrt);
    }

    static record Person(String name, int age) {//Records are implicitly final, and their components are implicitly final and private.
        // This means that records are immutable and their components cannot be modified after initialization.
    }
}