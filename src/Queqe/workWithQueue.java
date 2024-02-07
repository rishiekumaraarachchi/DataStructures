package Queqe;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class workWithQueue {
    private Node front, rear;

    public workWithQueue() {
        this.front = this.rear = null;
    }

    // Method to add an element to the queue
    public void enqueue(int item) {
        Node newNode = new Node(item);

        if (isEmpty()) {
            this.front = this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
    }

    // Method to remove the first element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Return -1 to signify an empty queue or you can throw an exception
        } else {
            int removedItem = this.front.data;
            this.front = this.front.next;

            // If front becomes null, then make rear null too
            if (this.front == null) {
                this.rear = null;
            }

            return removedItem;
        }
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return this.front == null;
    }

    public static void main(String[] args) {
        workWithQueue q = new workWithQueue();

        // Enqueue elements into the queue
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        // Dequeue elements from the queue
        System.out.println(q.dequeue()); // Output: 10
        System.out.println(q.dequeue()); // Output: 20

        // Enqueue another element
        q.enqueue(40);

        // Dequeue remaining elements
        System.out.println(q.dequeue()); // Output: 30
        System.out.println(q.dequeue()); // Output: 40

        // Try to dequeue from an empty queue
        System.out.println(q.dequeue()); // Output: Queue is empty
    }
}
