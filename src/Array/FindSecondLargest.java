package Array;

public class FindSecondLargest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println("The second largest is: "+findSecondLargest(arr));
    }
    public static int findSecondLargest(int[] arr){
        int max = arr[0];
        int secondMax= arr[0];
        for(int x: arr){
            if(x>max){
                secondMax=max;
                max=x;
            }
        }
        return secondMax;
    }
}
