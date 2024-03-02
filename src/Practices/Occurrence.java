package Practices;

public class Occurrence {
    public static void main(String[] args) {
        int[] arr = new int[]{
                1, 5, 9, 6, 4, 1, 5, 8, 9, 3, 6, 4, 7};

        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                int count = 1; // Initialize count for each new element
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true; // Mark the element as visited
                        count++;
                    }
                }
                System.out.println("The number " + arr[i] + " occurs " + count + " times");
            }
        }
    }
}


