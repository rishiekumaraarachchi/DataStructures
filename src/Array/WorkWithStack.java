package Array;

import java.util.Stack;

public class WorkWithStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack); // Print the entire stack

        System.out.println(stack.pop()); // Pop and print the top element
        System.out.println(stack); // Print the updated stack

        System.out.println(stack.peek()); // Peek and print the top element
        System.out.println(stack); // Print the stack (unchanged)

        // Search for an element in the stack
        boolean found = false;
        if (stack.search(23) > -1) { // Check if the result is greater than -1
            found = true;
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}
