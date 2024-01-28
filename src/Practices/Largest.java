package Practices;

public class Largest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 96, 9, 4, 3, 5, 6};
        int largest = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >largest) {
                largest = arr[i];
            }
        }
        System.out.println("The largest is : " + largest);
    }
}
