package LinkedList;

import java.util.EmptyStackException;

public class StackExample {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // Constructor to initialize the stack
    public StackExample(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    // Method to add an element to the top of the stack (push operation)
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " to the stack");
        }
    }

    // Method to remove the element from the top of the stack (pop operation)
    public int pop() {
        if (top == -1) {
            throw new EmptyStackException(); // Stack is empty
        } else {
            int poppedValue = stackArray[top--];
            System.out.println("Popped " + poppedValue + " from the stack");
            return poppedValue;
        }
    }

    // Method to view the element at the top of the stack (peek operation)
    public int peek() {
        if (top == -1) {
            throw new EmptyStackException(); // Stack is empty
        } else {
            return stackArray[top];
        }
    }

    public static void main(String[] args) {
        StackExample stack = new StackExample(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Top element after pops: " + stack.peek());
    }
}
