package LinkedList;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.addFirst(25);

        System.out.println(list);
    }
}

