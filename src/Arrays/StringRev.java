package Arrays;

public class StringRev {
    public static void main(String[] args) {
        String original = "Hello";
        System.out.println("Original String is : " + original);
        System.out.println("Reversed String is : " + stringReverse(original));

    }

    public static String stringReverse(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
