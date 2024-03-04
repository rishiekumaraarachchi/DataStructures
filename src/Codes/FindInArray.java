package Codes;

public class FindInArray {
    public static void main(String[] args) {
        int [] arr = new int[]{
                1,5,6,7,8,3,9,4,2,5,9,6,7,3,1,4
        };
        int target = 7;
        boolean check = false;

        for (int num: arr){
            if(num==target){
                check = true;
                break;
            }
        }
        if(check){
            System.out.println("Value "+ target+" Found");
        }else {
            System.out.println("Value "+ target+" Not Found");
        }

    }
}
