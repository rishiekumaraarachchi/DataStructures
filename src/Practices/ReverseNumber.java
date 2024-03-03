package Practices;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1256;
        System.out.println("original is : "+num);
        int reversed =reverseNum(num);
        System.out.println(reversed);
    }

    public static int reverseNum(int number){
        int reversedNumber = 0;
        while (number != 0){
            int digit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Move to the next digit by removing the last digit
        }
        return reversedNumber;
    }
}


