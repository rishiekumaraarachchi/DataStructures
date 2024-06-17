package Codes;

public class SearchinArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 7, 6, 7, 5, 9, 4, 3};
        int search=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]%2==0){
                search=arr[i];
                break;
            }
        }
        System.out.println(search);
    }
}

