package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TheArrays {
    public static void main(String[] args) {
        String[] colours = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 colours: ");
        for (int i = 0; i < colours.length; i++) {
            colours[i] = scanner.nextLine();
        }
        System.out.println("Your colours are: ");
//        System.out.println(Arrays.toString(colours));
        Arrays.stream(colours).forEach(System.out::println);

        System.out.println("Enter a colour to search: ");
        String search = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < colours.length; i++) {
            if (colours[i].equals(search)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

    }
}
