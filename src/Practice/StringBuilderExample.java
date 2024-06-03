package Practice;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Appending a string
        sb.append(" World");
        System.out.println("After append: " + sb);  // Output: Hello World

        // Inserting a string
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);  // Output: Hello, World

        // Reversing the string
        sb.reverse();
        System.out.println("After reverse: " + sb);  // Output: dlroW ,olleH

        // Deleting a portion of the string
        sb.delete(5, 7);
        System.out.println("After delete: " + sb);  // Output: dlroolleH

        // Converting back to a string
        String finalString = sb.toString();
        System.out.println("Final string: " + finalString);  // Output: dlroolleH
    }
}
