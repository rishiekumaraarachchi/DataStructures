package Practices;

public class LCMPractice {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;

        int max = Math.max(a,b);

        while (true){
            if (max%a==0 && max%b==0){
                System.out.printf("The LCM of %d and %d is %d.\n", a, b, max);
                break;
            }
            ++max;
        }
    }
}
