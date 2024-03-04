package Codes;

//public class Missing {
//    public static void main(String[] args) {
//        int [] arr = new int[]{1,2,3,5,6,7,8,9};
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]!=i+1){
//                System.out.println("Missing Number is "+(i+1));
//                break;
//            }
//        }
//    }
//}

public class Missing {
    public static int findMissingValue(int[] array) {
        int n = array.length + 1; // One element is missing, so the length of the array + 1 is the total count
        int totalSum = (n * (n + 1)) / 2; // Sum of the first n natural numbers

        int arraySum = 0;
        for (int num : array) {
            arraySum += num;
        }

        return totalSum - arraySum; // The difference is the missing value
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8, 9, 10}; // Example array with one missing value
        int missingValue = findMissingValue(array);
        System.out.println("The missing value is: " + missingValue);
    }
}
