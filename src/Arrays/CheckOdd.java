package Arrays;

public class CheckOdd {
    public static void main(String[] args) {
        int [] arr= new int[]{1,5,3,7,6,9,4};
        checkOdd(arr);

    }
    public static void checkOdd(int [] arr){
        for(int x:arr){
            if(x%2==1){
                System.out.print(x+",");
            }
        }
    }
}
