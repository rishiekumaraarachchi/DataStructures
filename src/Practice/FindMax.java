package Practice;

public class FindMax {
    public static void main(String[] args) {
        int [] arr= new int[]{1,2,3,4,5,6,7};
        System.out.println("Maximum of the arr: "+findMax(arr));

    }
    public static int findMax(int [] arr){
        int max = arr[0];
        for(int x :arr){
            if(x>max)
                max=x;
        }
        return max;
    }
}
