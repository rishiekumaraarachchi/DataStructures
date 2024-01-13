package Arrays;

public class Demo {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};
        int target = 4;
        int ans = linearSearch(arr, target);
        if (ans == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+ans);
        }
    }

    public static int linearSearch(int[] arr, int target) {
    if(arr.length == 0){
            return -1;
        }
       for (int i=0;i<arr.length;i++){
           int element = arr[i];
           if (element == target){
               return i;
           }
       }
        return -1;

    }

}
