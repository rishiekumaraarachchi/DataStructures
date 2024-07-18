package Array;

public class MaxinArray {
    public static void main(String[] args) {
        int [] arr = new int []{1,5,7,3,4,5,9,4};
        findMax(arr);

    }
    public static void findMax(int []arr){
        int max=0;
        for (int i :arr){
            if(i>max){
                max=i;
            }
        }
        System.out.print("Largest in array: " + max);
    }
}
