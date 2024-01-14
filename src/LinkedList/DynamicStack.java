package LinkedList;

import java.util.EmptyStackException;

public class DynamicStack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // Constructor to initialize the stack with an initial size
    public DynamicStack(int initialSize) {
        maxSize = initialSize;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    // Method to add an element to the top of the stack (push operation)
    public void push(int value) {
        if (top == maxSize - 1) {
            resize(); // Resize the array if it's full
        }

        stackArray[++top] = value;
        System.out.println("Pushed " + value + " to the stack");
    }

    // Method to remove the element from the top of the stack (pop operation)
    public int pop() {
        if (top == -1) {
            throw new EmptyStackException(); // Stack is empty
        }

        int poppedValue = stackArray[top--];
        System.out.println("Popped " + poppedValue + " from the stack");
        return poppedValue;
    }

    // Method to view the element at the top of the stack (peek operation)
    public int peek() {
        if (top == -1) {
            throw new EmptyStackException(); // Stack is empty
        }

        return stackArray[top];
    }

    // Method to resize the array when the stack is full
    private void resize() {
        int newMaxSize = maxSize * 2; // Double the size
        int[] newStackArray = new int[newMaxSize];

        // Copy elements to the new array
        System.arraycopy(stackArray, 0, newStackArray, 0, maxSize);

        stackArray = newStackArray;
        maxSize = newMaxSize;

        System.out.println("Stack resized to " + newMaxSize);
    }

    public static void main(String[] args) {
        DynamicStack dynamicStack = new DynamicStack(3);

        dynamicStack.push(10);
        dynamicStack.push(20);
        dynamicStack.push(30);

        System.out.println("Top element: " + dynamicStack.peek());

        dynamicStack.push(40);
        dynamicStack.push(50);

        System.out.println("Top element after pushes: " + dynamicStack.peek());

        dynamicStack.pop();
        dynamicStack.pop();
        dynamicStack.pop();

        System.out.println("Top element after pops: " + dynamicStack.peek());
    }
}
