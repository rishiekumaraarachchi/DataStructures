package Practices;

public class SUM {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 96, 9, 4, 3, 5, 6};
        int sum =0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum+=arr[i];
        }
        System.out.println("The sum is : " + sum);

    }
}
