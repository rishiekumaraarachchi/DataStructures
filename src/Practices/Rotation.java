package Practices;

public class Rotation {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Corrected loop condition to avoid out-of-bounds access
        for (int i = 0; i < arr.length-1 ; i++) {

            for (int j = 0; j < arr.length -1 - i; j++) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }

        System.out.println("\nNew array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
