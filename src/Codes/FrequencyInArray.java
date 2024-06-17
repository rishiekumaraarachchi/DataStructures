package Codes;

public class FrequencyInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3, 8, 8, 4, 4, 6, 9, 1, 1, 1, 5};
        int[] result = frequencyCheck(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] frequencyCheck(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        boolean[] checked = new boolean[n]; // Array to keep track of counted elements

        for (int i = 0; i < n; i++) {
            if (!checked[i]) { // If this element has not been counted yet
                int count = 1; // Start counting this element
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        checked[j] = true; // Mark this element as counted
                    }
                }
                result[i] = count;
                checked[i] = true; // Mark the current element as counted
            } else {
                result[i] = 0; // Already counted element should have frequency 0 in result array
            }
        }
        return result;
    }
}

