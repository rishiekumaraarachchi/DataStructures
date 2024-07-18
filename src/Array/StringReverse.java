package Array;

public class StringReverse {
    public static void main(String[] args) {
        String name= "Hello";
        String reverse = stringReverse(name);
        System.out.println(reverse );

    }
    public static String stringReverse(String x){
        char [] charArray = x.toCharArray();
        int left=0;
        int right = x.length()-1;
        while (left<right){
            char temp=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}
